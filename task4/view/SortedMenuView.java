package com.androsor.basic_of_oop.task4.view;

import com.androsor.basic_of_oop.task4.menu.SortedMenuItem;

import static com.androsor.basic_of_oop.task4.menu.SortedMenuItem.*;

public class SortedMenuView {

    public void showSortedMenu() {
        System.out.printf("\n---------------------------------------\n" +
                "%d ->  Отсортированные по имени\n%d ->  Отсортированные по стоимости\n" +
                "%d ->  Предварительно перемешать\n"
                + "---------------------------------------\n",SORT_BY_NAME.getCode(), SORT_BY_PRICE.getCode(), SORT_BY_RANDOM.getCode()
        );
    }
}
