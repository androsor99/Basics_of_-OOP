package com.androsor.basic_of_oop.task4.view.Impl;

import com.androsor.basic_of_oop.task4.view.Viewer;
import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

import static com.androsor.basic_of_oop.task4.controller.CommandProvider.ALL_TREASURES;
import static com.androsor.basic_of_oop.task4.controller.CommandProvider.DEAREST_TREASURE;
import static com.androsor.basic_of_oop.task4.controller.CommandProvider.EXIT_PROGRAM;
import static com.androsor.basic_of_oop.task4.controller.CommandProvider.TREASURES_FOR_AMOUNT;

public class ConsoleViewerImpl implements Viewer {

    @Override
    public void showAllTreasure(List<Treasure> treasures) {
        System.out.printf("| %-35s | %-10s |\n", "СОКРОВИЩЕ", "СТОИМОСТЬ");
        System.out.print("------------------------------------------------------------------\n");
        treasures.forEach(this::showTreasure);
        System.out.print("------------------------------------------------------------------\n");
    }

    @Override
    public void showTreasure(Treasure treasure) {
        System.out.printf("| %-35s | %4d монет |\n", treasure.getName(), treasure.getPrice());
    }

    @Override
    public void showMessage(String line) {
        System.out.println(line);
    }

    public static void showMainMenu() {
        System.out.printf("""
                
                ---------------------------------------
                %d ->  Показать все сокровища
                %d ->  Показать самое дорогое сокровище
                %d ->  Выбрать сокровища на заданную сумму
                %d ->  Выход из программы
                ---------------------------------------
                """, ALL_TREASURES.getCode(), DEAREST_TREASURE.getCode(),TREASURES_FOR_AMOUNT.getCode(), EXIT_PROGRAM.getCode()
        );
    }
}
