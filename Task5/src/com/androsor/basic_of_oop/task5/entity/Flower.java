package com.androsor.basic_of_oop.task5.entity;

import java.io.Serial;
import java.io.Serializable;

public class Flower extends Product implements Serializable{

    @Serial
    private static final long serialVersionUID = 5890870495424358934L;

    public Flower(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Flower{} " + super.toString();
    }
}
