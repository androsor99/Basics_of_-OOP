package com.androsor.basic_of_oop.task2.entity;

public enum TypePayment {

    CASH("Наличными"),
    BANK_CARD("Банковской картой"),
    CREDIT("Вкредит");

    private final String type;

    TypePayment(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
