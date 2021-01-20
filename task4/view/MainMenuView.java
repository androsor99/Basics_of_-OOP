package com.androsor.basic_of_oop.task4.view;

import static com.androsor.basic_of_oop.task4.menu.MainMenuItem.*;

public class MainMenuView {

    public void showMainMenu() {
        System.out.printf("\n---------------------------------------\n" +
                "%d ->  Показать все сокровища\n%d ->  Показать самое дорогое сокровище\n" +
                "%d ->  Выбрать сокровища на заданную сумму\n%d ->  Выход из программы\n"
                + "---------------------------------------\n", ALL_TREASURES.getCode(), DEAREST_TREASURE.getCode(),
                TREASURES_FOR_AMOUNT.getCode(), EXIT_PROGRAM.getCode()
        );
    }

    public void showInvalidCommand() {
        System.out.print("Неверная команда!\n");
    }

}
