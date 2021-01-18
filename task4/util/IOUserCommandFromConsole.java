package com.androsor.basic_of_oop.task4.util;

import java.util.Scanner;

public class IOUserCommandFromConsole {

    private static final String INPUT_MESSAGE = "Введите число!";

    public static int getIntFromConsole(String message) {

        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println(INPUT_MESSAGE);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int getIntFromConsole() {

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println(INPUT_MESSAGE);
            sc.next();
        }
        return sc.nextInt();
    }
}
