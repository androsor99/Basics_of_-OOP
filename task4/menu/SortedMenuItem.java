package com.androsor.basic_of_oop.task4.menu;

import com.androsor.basic_of_oop.task4.logic.TreasureSortByNumber;
import com.androsor.basic_of_oop.task4.logic.TreasureSortByPrice;
import com.androsor.basic_of_oop.task4.logic.TreasureSortByRandom;
import com.androsor.basic_of_oop.task4.logic.TreasureSorter;

public enum SortedMenuItem {

    SORT_BY_NAME(1, new TreasureSortByNumber()),
    SORT_BY_PRICE(2, new TreasureSortByPrice()),
    SORT_BY_RANDOM(3, new TreasureSortByRandom());

    private final int code;
    private final TreasureSorter treasureSorter;


    SortedMenuItem(int code, TreasureSorter treasureSorter) {
        this.code = code;
        this.treasureSorter = treasureSorter;
    }

    public int getCode() {
        return code;
    }

    public TreasureSorter getTreasureSorter() {
        return treasureSorter;
    }

    public static SortedMenuItem getSortedMenuItemCode(int code) {

        for (SortedMenuItem item : SortedMenuItem.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }
}
