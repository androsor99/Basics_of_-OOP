package com.androsor.basic_of_oop.task5.main;

import com.androsor.basic_of_oop.task5.controller.impl.BouquetControllerImpl;
import com.androsor.basic_of_oop.task5.controller.Controller;

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
public class Runner {

    public static void main(String[] args) {
        Controller controller = new BouquetControllerImpl();
        String request = "createBouquet name=Андруха! packaging=Коробка Роза=4;Тюльпан=5;Ромашишка=7";
        String response = controller.doAction(request);
        System.out.println(response);

    }
}
