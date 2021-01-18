package com.androsor.basic_of_oop.task3.main;

import com.androsor.basic_of_oop.task3.entity.Calendar;
import com.androsor.basic_of_oop.task3.view.Viewer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Runner {

    public static void main(String[] args) {

        int year = 2021;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "Новый Год");
        calendar.addHoliday(LocalDate.parse("04.01." + year, dtf), "Днюха");
        calendar.addHoliday(LocalDate.parse("07.01." + year, dtf), "Наши Коляды");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dtf), "Бабский праздник");
        calendar.addHoliday(LocalDate.parse("01.05." + year, dtf), "День труда");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dtf), "День Победы");
        calendar.addHoliday(LocalDate.parse("03.07." + year, dtf), "День Незалежнастi");
        calendar.addHoliday(LocalDate.parse("07.11." + year, dtf), "День Октябрьской революции");
        calendar.addHoliday(LocalDate.parse("25.12." + year, dtf), "Котолические Коляды");

        Viewer.printWeekendsAndHolidays(year, calendar);

        calendar.removeHoliday("Днюха");
        Viewer.printWeekendsAndHolidays(year, calendar);
    }
}
