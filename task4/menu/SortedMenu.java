package com.androsor.basic_of_oop.task4.menu;

import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.util.ConsoleScanner;
import com.androsor.basic_of_oop.task4.util.Scanner;
import com.androsor.basic_of_oop.task4.view.SortedMenuView;
import com.androsor.basic_of_oop.task4.view.TreasureView;

import java.util.Objects;

public class SortedMenu {

    private final SortedMenuView sortedMenuView = new SortedMenuView();
    private final Scanner scanner = new ConsoleScanner();
    private final TreasureView treasureView = new TreasureView();

    public void runMenu(DragonCave dragonCave) {

        sortedMenuView.showSortedMenu();
        int userCommand = scanner.getCommandNumberFromUser();
        treasureView.showTreasureCaveName(dragonCave);
        treasureView.showTreasureList(Objects.requireNonNull(SortedMenuItem.getSortedMenuItemCode(userCommand)).getTreasureSorter().sort(dragonCave.getTreasures()));
    }
}

