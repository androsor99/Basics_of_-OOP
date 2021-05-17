package com.androsor.basic_of_oop.task4.dao.util;

import java.util.Scanner;

public class IOHelper {

    private static final String INPUT_INVALID_MESSAGE = "Введите число!";
    private static final String INPUT_AMOUNT_MESSAGE = "Введите сумму!";
    private static final String INPUT_MESSAGE = "Введите команду\n";
    private static final Scanner scanner = new Scanner(System.in);

    public static int getCommandFromUser() {
        System.out.print(INPUT_MESSAGE);
        return getCommandNumberFromUser();
    }
    public static int getAmountFromUser() {
        System.out.println(INPUT_AMOUNT_MESSAGE);
        return getCommandNumberFromUser();
    }

    private static int getCommandNumberFromUser() {
        while (!scanner.hasNextInt()) {
            System.out.println(INPUT_INVALID_MESSAGE);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
