package com.androsor.basic_of_oop.task5.main;

/**
 * Correctly design and implement the problem domain.
 *   • To create objects from a class hierarchy, consider using
 *   generative design patterns.
 *   • Implement user input validation, but not client side.
 *   • Regular expressions can be used to check the correctness of the transmitted data.
 *   • The menu for selecting an action by the user can be omitted, use a stub.
 *   • Special Condition: Override the toString (), equals (), and hashCode () methods where necessary.
 * Option A. Flower arrangement. Implement an application that allows you to create flower arrangements
 * (an object that represents a flower arrangement). Flowers and packaging are the components of a flower arrangement.
 */

import com.androsor.basic_of_oop.task5.factory.ObjectFactory;
import com.androsor.basic_of_oop.task5.view.ConsoleHelper;
import com.androsor.basic_of_oop.task5.сontroller.Controller;

public class Runner {

    static Controller controller = ObjectFactory.INSTANCE.crateObject(Controller.class) ;
    static final String ALL_COMMAND = "1";
    static final String SHOW_FLOWERS_DESCRIPTION = "2";
    static final String SHOW_PACKING_DESCRIPTION = "3";
    static final String SHOW_FLOWERS_COMPOSITION_DESCRIPTION = "4";
    static final String INVALID_COMMAND = "Неверная команда. Введите команду!";
    static final String MESSAGE_EXIT = "Не очень-то и хотелось!";
    static final String CODE_EXIT = "0";

    public static void main(String[] args) {

        run();
    }

    public static void run() {

        controller.getAllCommand();
        String userCommand;
        while (!(userCommand = ConsoleHelper.readString()).equals(CODE_EXIT)) {

            switch (userCommand) {
                case ALL_COMMAND -> controller.getAllCommand();
                case SHOW_FLOWERS_DESCRIPTION -> controller.getFlowerDescription();
                case SHOW_PACKING_DESCRIPTION -> controller.getPackDescription();
                case SHOW_FLOWERS_COMPOSITION_DESCRIPTION -> controller.getFlowerComposition();
                default -> ConsoleHelper.writeMessage(INVALID_COMMAND);
            }
        }
        ConsoleHelper.writeMessage(MESSAGE_EXIT);
    }
}
