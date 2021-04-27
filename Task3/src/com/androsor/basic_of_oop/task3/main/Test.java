package com.androsor.basic_of_oop.task3.main;

import com.androsor.basic_of_oop.task3.entity.Calendar;

import java.time.LocalDate;
import java.time.Year;

import static com.androsor.basic_of_oop.task3.view.Viewer.printEvents;
import static java.time.Month.APRIL;
import static java.time.Month.FEBRUARY;

public class Test {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        int year = Year.now().getValue();
        System.out.println("Добавим несколько событий");
        calendar.add("Моя днюха", "Поздравить", LocalDate.of(year, FEBRUARY, 4));
        calendar.add("Олькина днюха", "Поздравить", LocalDate.of(year, APRIL, 10));
        calendar.add("Сугодняшний день", "Набухаться", LocalDate.of(year, APRIL, 27));

        printEvents(calendar.getEvents("Моя днюха"));
        printEvents(calendar.getEvents(LocalDate.now()));
    }
}
