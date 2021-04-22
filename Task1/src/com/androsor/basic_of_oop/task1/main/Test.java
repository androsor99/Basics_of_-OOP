package com.androsor.basic_of_oop.task1.main;

import com.androsor.basic_of_oop.task1.entity.Directory;
import com.androsor.basic_of_oop.task1.entity.TextFile;

import static com.androsor.basic_of_oop.task1.entity.TextFile.create;

/**
 *  Создать объект Текстовый файл, используя классы Файл, Директория. Методы:
 *  создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Test {

    public static void main(String[] args) {
        Directory directory_1 = new Directory("D\\Чушь\\Документы");
        TextFile textFile_1 = create("Котики", directory_1);
        textFile_1.addContent("To be, or not to be, that is the question:");
        System.out.println(textFile_1);
        textFile_1.open();
        textFile_1.rename("Собачки");
        System.out.println(textFile_1);
    }
}

