package com.androsor.basic_of_oop.task5.view;

import com.androsor.basic_of_oop.task5.entity.flower.FlowerType;
import com.androsor.basic_of_oop.task5.entity.pack.PackType;

public class ViewImpl implements View {

    @Override
    public void printAllCommand() {

        ConsoleHelper.writeMessage(
                "\nВыберите действие:\n" +
                        "-------------------------------------\n" +
                        "1 -> Помощь\n" +
                        "2 -> Показать список всех цветов\n" +
                        "3 -> Показать список упоковки\n" +
                        "4 -> Создать собственный букет\n" +
                        "0 -> Выход из программы\n" +
                        "-------------------------------------");
    }

    @Override
    public UserRequest getUserRequest() {

        ConsoleHelper.writeMessage("Составьте ваш букет\nУкажите список цветов из которых Вы хотите составить букет в следующем формате:\n" +
                "Наименование цветка-количество\n"+
                "Пример:\n" +
                        "\tРоза-3 Ромашка-10\n" );

        String nameAndCountFlower = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Укажите тип упаковки:\n");
        String namePack = ConsoleHelper.readString().trim();
        return new UserRequest(nameAndCountFlower, namePack);
    }

    private String showProductDescription(String string, Double count) {

        return String.format("| %-15s | %6.2f $ |", string, count);
    }

    @Override
    public void printFlowerDescription() {

        for (FlowerType item : FlowerType.values()) {
            ConsoleHelper.writeMessage(showProductDescription(item.getName(), item.getPrice()));
        }
    }

    @Override
    public void printPackDescription() {
        
        for (PackType item : PackType.values()) {
            ConsoleHelper.writeMessage(showProductDescription(item.getName(), item.getPrice()));
        }
    }
}
