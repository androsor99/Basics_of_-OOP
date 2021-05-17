package com.androsor.basic_of_oop.task3.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calendar {

    private List<Event> events;

    public Calendar() { this.events = new ArrayList<>(); }

    public Calendar(List<Event> events) { this.events = events; }

    public Calendar(Calendar calendar) {
        this.events = new ArrayList<>();
        events.addAll(calendar.getEvents());
    }

    public List<Event> getEvents() {
        this.events.sort(Comparator.comparing(Event::getDate));
        return this.events;
    }

    public List<Event> getEvents(String name) {
        return this.events.stream()
                .filter(event -> event.getName().equals(name))
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());
    }

    public List<Event> getEvents(LocalDate date) {
        return this.events.stream()
                .filter(event -> event.getDate().equals(date))
                .sorted(Comparator.comparing(Event::getName))
                .collect(Collectors.toList());
    }

    public void setEvents(List<Event> events) { this.events = events; }

    public void add(String name, String description, LocalDate date) {
        if (description == null || description.length() == 0) {
            events.add(new Event(name, date));
        } else {
            events.add(new Event(name, description, date));
        }
    }

    public void remove(LocalDate date) {
        this.events.removeIf(event -> event.getDate().equals(date));
    }

    public void remove(String name) {
        this.events.removeIf(event -> event.getName().equals(name));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(events, calendar.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events);
    }

    /**
     *
     */
    public static class Event {

        private String name;
        private String description;
        private LocalDate date;

        public Event(String name, String description, LocalDate date) {
            this.name = name;
            this.description = description;
            this.date = date;
        }

        public Event(String name, LocalDate date) {
            this.name = name;
            this.description = "Описание события";
            this.date = date;
        }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }

        public void setDescription(String description) { this.description = description; }

        public LocalDate getDate() { return date; }

        public void setDate(LocalDate date) { this.date = date; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Event event = (Event) o;
            return Objects.equals(name, event.name) && Objects.equals(description, event.description) && Objects.equals(date, event.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, description, date);
        }

        @Override
        public String toString() {
            return "Event{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", date=" + date +
                    '}';
        }
    }
}
