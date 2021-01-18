package com.androsor.basic_of_oop.task3.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Calendar {

    private final int year;
    private final List<Holiday> holidaysAndWeekends;

    public Calendar(int year) {
        this.year = year;
        this.holidaysAndWeekends = new ArrayList<>();
        addWeekend(year);
    }

    public List<Holiday> getHolidaysAndWeekends() {
        return holidaysAndWeekends;
    }

    public void addWeekend(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        while (date.getDayOfWeek() != DayOfWeek.SATURDAY
                && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                holidaysAndWeekends.add(new Holiday(date, "Суббота"));
                date = date.plusDays(1);
            } else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holidaysAndWeekends.add(new Holiday(date, "Воскресенье"));
                date = date.plusDays(6);
            } else { date = date.plusDays(1); }
        }
    }

    public void addHoliday(LocalDate holiday, String nameOfHoliday) {

        holidaysAndWeekends.add(new Holiday(holiday, nameOfHoliday));
        holidaysAndWeekends.sort(Comparator.comparing(Holiday::getHoliday).thenComparing(Holiday::getNameOfHoliday));
    }

    public void removeHoliday(String nameOfHoliday) {
        holidaysAndWeekends.removeIf(nextHoliday -> nextHoliday.getNameOfHoliday().equals(nameOfHoliday));
    }

    public static class Holiday {

        private LocalDate holiday;
        private String nameOfHoliday;

        public Holiday(LocalDate holiday, String nameOfHoliday) {
            this.holiday = holiday;
            this.nameOfHoliday = nameOfHoliday;
        }

        public void setHoliday(LocalDate holiday) {
            this.holiday = holiday;
        }

        public LocalDate getHoliday() {
            return holiday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Holiday holiday1 = (Holiday) o;
            return holiday.equals(holiday1.holiday) &&
                    nameOfHoliday.equals(holiday1.nameOfHoliday);
        }

        @Override
        public int hashCode() {
            return Objects.hash(holiday, nameOfHoliday);
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "holiday=" + holiday +
                    ", nameOfHoliday='" + nameOfHoliday + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return year == calendar.year &&
                holidaysAndWeekends.equals(calendar.holidaysAndWeekends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, holidaysAndWeekends);
    }
}
