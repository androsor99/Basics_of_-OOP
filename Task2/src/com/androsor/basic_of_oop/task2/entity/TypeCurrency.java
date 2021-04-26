package com.androsor.basic_of_oop.task2.entity;

public enum TypeCurrency {

    BLR("Белорусский рубль"),
    USD("Американский доллар"),
    RUR("Российский рубль");

    private final String currency;

    TypeCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
