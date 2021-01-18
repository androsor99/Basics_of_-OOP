package com.androsor.basic_of_oop.task5.сontroller;

import com.androsor.basic_of_oop.task5.creator.CompositionCreator;
import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.factory.ObjectFactory;
import com.androsor.basic_of_oop.task5.view.ConsoleHelper;
import com.androsor.basic_of_oop.task5.view.UserRequest;
import com.androsor.basic_of_oop.task5.view.View;

public class ControllerImp implements Controller {

    private final CompositionCreator compositionCreator;
    private final View view;


    public ControllerImp() {
        this.compositionCreator = ObjectFactory.INSTANCE.crateObject(CompositionCreator.class);
        this.view = ObjectFactory.INSTANCE.crateObject(View.class);
    }

    @Override
    public void getAllCommand() {
        view.printAllCommand();
    }

    @Override
    public void getFlowerDescription() {
        view.printFlowerDescription();
    }

    @Override
    public void getPackDescription() {
        view.printPackDescription();
    }

    @Override
    public void getFlowerComposition() {
        UserRequest userRequest = view.getUserRequest();
        Product product = compositionCreator.createFlowerComposition(userRequest);
        ConsoleHelper.writeMessage(product.getName());
    }


    public void action(String command) {

        switch (command) {
            case "1" -> view.printAllCommand();
            case "2" -> view.printFlowerDescription();
            case "3" -> view.printPackDescription();
            case "4" -> {

                UserRequest userRequest = view.getUserRequest();
                Product product = compositionCreator.createFlowerComposition(userRequest);
                ConsoleHelper.writeMessage(product.getName());
            }
            default -> ConsoleHelper.writeMessage("Неверная команда. Введите команду!");
        }
    }
}


