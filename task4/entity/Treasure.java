package com.androsor.basic_of_oop.task4.entity;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {


    private static final long serialVersionUID = -319673456842418235L;
    private String name;
    private int price;

    public Treasure() {
    }

    public Treasure(String name) {
        this.name = name;
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return price == treasure.price &&
                name.equals(treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
