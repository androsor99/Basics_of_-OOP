package com.androsor.basic_of_oop.task3.view;

import com.androsor.basic_of_oop.task3.entity.Calendar;

public class Viewer {

    public static void printWeekendsAndHolidays(int year, Calendar calendar) {

        System.out.printf(" Выходные и праздничные дни на %d год:\n", year);
        for (Calendar.Holiday holiday : calendar.getHolidaysAndWeekends()) {
            System.out.printf("%s - %s\n", holiday.getHoliday(), holiday.getNameOfHoliday());
        }
    }
}
