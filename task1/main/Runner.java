package com.androsor.basic_of_oop.task1.main;

/**
 *  Создать объект Текстовый файл, используя классы Файл, Директория. Методы:
 *  создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

import com.androsor.basic_of_oop.task1.entity.Directory;
import com.androsor.basic_of_oop.task1.entity.File;
import com.androsor.basic_of_oop.task1.entity.TextFile;

public class Runner {

    public static void main(String[] args) {

        File file = new File("Пчелки");
        TextFile textFile = new TextFile("Котики", "Первое первое первое");
        Directory directory = new Directory("Папка");
        directory.addFile(file);
        directory.addFile(textFile);

        System.out.println(directory);

        System.out.println("\nСоздадим деректории");
        directory.createDirectories("Мамка");
        System.out.println(directory);

        System.out.println("\nПереименуем файл");
        try {
            directory.renameFile("Котики", "Собачки");
            System.out.println(directory);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nВыведем содержимое файла в консоль");
        try {
            System.out.println(directory.getContent("Собачки"));

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nДополним содержимое файла");
        try {
            directory.modifyFile("Собачки", "Второе второе второе");
            System.out.println(directory.getContent("Собачки"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nУдаляем файл и директорию");
        try {
            directory.removeFile("Собачки");
            System.out.println(directory);
            directory.removeDirectory("Мамка");
            System.out.println(directory);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        }
    }
}

