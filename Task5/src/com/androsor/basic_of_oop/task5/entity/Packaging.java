package com.androsor.basic_of_oop.task5.entity;

import java.io.Serial;
import java.io.Serializable;

public class Packaging extends Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 5708147148725333175L;

    public Packaging() {
        super("Без упаковки", 0);
    }

    public Packaging(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Pack{} " + super.toString();
    }
}
