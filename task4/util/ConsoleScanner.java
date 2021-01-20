package com.androsor.basic_of_oop.task4.util;

public class ConsoleScanner implements Scanner {

    @Override
    public int getCommandFromUser() {
        return IOUserCommandFromConsole.getIntFromConsole("Введите команду\n");
    }

    @Override
    public int getCommandNumberFromUser() {
        return IOUserCommandFromConsole.getIntFromConsole();
    }
}
