package com.androsor.basic_of_oop.task4.controller;

import com.androsor.basic_of_oop.task4.controller.impl.CommandAllTreasureImpl;
import com.androsor.basic_of_oop.task4.controller.impl.CommandExitImpl;
import com.androsor.basic_of_oop.task4.controller.impl.CommandMostExpensiveTreasureImpl;
import com.androsor.basic_of_oop.task4.controller.impl.CommandTreasuresWorthImpl;

public enum CommandProvider {

    ALL_TREASURES(1, new CommandAllTreasureImpl()),
    DEAREST_TREASURE(2, new CommandMostExpensiveTreasureImpl()),
    TREASURES_FOR_AMOUNT(3, new CommandTreasuresWorthImpl()),
    EXIT_PROGRAM(0, new CommandExitImpl());

    private final int code;
    private final Command command;

    CommandProvider(int code, Command command) {
        this.code = code;
        this.command = command;
    }

    public int getCode() {
        return code;
    }

    public Command getCommand() {
        return command;
    }

    public static CommandProvider getItemCode(int code) {
        for (CommandProvider item : CommandProvider.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        throw new IllegalArgumentException("Неверная команда");
    }
}
