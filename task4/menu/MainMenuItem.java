package com.androsor.basic_of_oop.task4.menu;

public enum MainMenuItem {

    ALL_TREASURES(1),
    DEAREST_TREASURE(2),
    TREASURES_FOR_AMOUNT(3),
    EXIT_PROGRAM(0);

    private final int code;

    MainMenuItem(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MainMenuItem getMainMenuItemCode(int code) {

        for (MainMenuItem item : MainMenuItem.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }
}
