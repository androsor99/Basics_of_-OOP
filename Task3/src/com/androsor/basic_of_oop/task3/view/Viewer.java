package com.androsor.basic_of_oop.task3.view;

import com.androsor.basic_of_oop.task3.entity.Calendar;

import java.util.List;

import static java.lang.String.format;

public class Viewer {

    public static void printEvents(List<Calendar.Event> events) {
        System.out.println(getEventsToString(events));
    }

    private static String getEventsToString(List<Calendar.Event> events) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Calendar.Event event : events) {
            stringBuilder.append(format("Событие - %s\n", event.getName()))
                    .append(format("Заметка - %s\n", event.getDescription()))
                    .append(format("Дата - %s\n", event.getDate()));
        }
        return stringBuilder.toString();
    }
}
