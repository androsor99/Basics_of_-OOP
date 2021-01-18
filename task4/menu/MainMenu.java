package com.androsor.basic_of_oop.task4.menu;

import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.logic.TreasureSelect;
import com.androsor.basic_of_oop.task4.logic.TreasureSelector;
import com.androsor.basic_of_oop.task4.util.ConsoleScanner;
import com.androsor.basic_of_oop.task4.util.Scanner;
import com.androsor.basic_of_oop.task4.util.TreasureStorage;
import com.androsor.basic_of_oop.task4.util.TreasureTxtStorage;
import com.androsor.basic_of_oop.task4.view.MainMenuView;
import com.androsor.basic_of_oop.task4.view.TreasureView;

import java.io.IOException;
import java.util.Objects;

import static com.androsor.basic_of_oop.task4.menu.MainMenuItem.*;

public class MainMenu {

    private static final MainMenuView mainMenuView= new MainMenuView();
    private final Scanner scanner = new ConsoleScanner();
    private final TreasureSelector treasureSelector = new TreasureSelect();
    private final TreasureView treasureView = new TreasureView();

    public void runMenu(DragonCave dragonCave, TreasureStorage storage) throws IOException {

        while (true) {
            mainMenuView.showMainMenu();
            int userCommand = scanner.getCommandFromUser();
            MainMenuItem item = getMainMenuItemCode(userCommand);
            switch (Objects.requireNonNull(item)) {
                case ALL_TREASURES -> {
                    SortedMenu sortedMenu = new SortedMenu();
                    sortedMenu.runMenu(dragonCave);
                }
                case DEAREST_TREASURE -> {
                    treasureView.showListHeader();
                    treasureView.showTreasure(treasureSelector.getMostExpensiveTreasure(dragonCave.getTreasures()));
                }

                case TREASURES_FOR_AMOUNT -> {
                    treasureView.showMessageAboutAmount();
                    int amount = scanner.getCommandNumberFromUser();
                    treasureView.showTreasureList(treasureSelector.getListForAmount(dragonCave.getTreasures(), amount));
                }
                case EXIT_PROGRAM -> {
                    storage.saveTreasureList(dragonCave.getTreasures());
                    System.exit(EXIT_PROGRAM.getCode());
                }
                default -> mainMenuView.showInvalidCommand();
            }
        }
    }
}

