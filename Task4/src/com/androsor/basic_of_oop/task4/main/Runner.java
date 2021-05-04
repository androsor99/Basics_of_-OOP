package com.androsor.basic_of_oop.task4.main;

/**
 * Create a console application that meets the following requirements:
 *
 * • The application must be object-oriented, not procedural-oriented.
 *
 * • Each class should have a meaningful name and informative composition.
 *
 * • Inheritance should only be used when it makes sense.
 *
 * • When coding, the java code convention must be used.
 *
 * • Classes should be correctly decomposed into packages.
 *
 * • The console menu should be minimal.
 *
 * • Files can be used to store data.
 *
 * The dragon and its treasures. Create a program that allows you to process information about 100 treasures
 * in the dragon's cave. Implement the ability to view treasures, select the most expensive treasure and select
 * treasures for a specified amount.
 */

import com.androsor.basic_of_oop.task4.controller.Controller;
import com.androsor.basic_of_oop.task4.controller.impl.DragonCaveController;
import com.androsor.basic_of_oop.task4.dao.util.IOHelper;
import com.androsor.basic_of_oop.task4.view.Impl.ConsoleViewerImpl;

public class Runner {

    public static void main(String[] args) {
        while (true) {
            ConsoleViewerImpl.showMainMenu();
            int request = IOHelper.getCommandFromUser();
            Controller controller = new DragonCaveController();
            controller.doAction(request);
        }
    }
}
