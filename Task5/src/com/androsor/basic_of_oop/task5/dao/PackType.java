package com.androsor.basic_of_oop.task5.dao;

import com.androsor.basic_of_oop.task5.entity.Packaging;

import java.util.Arrays;

public enum  PackType {

    BOX(new Packaging("Коробка", 15.50)),
    BASKET(new Packaging("Карзина", 10.10)),
    FELT(new Packaging("Фетр", 8.80)),
    PAPER(new Packaging("Бумажная", 5.55));
    //WITHOUT_PACKAGING("Без упоковки", 0);

    private final Packaging packaging;

    PackType(Packaging packaging) {
        this.packaging = packaging;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public static Packaging getPackagingByName(String name) {
        PackType result = Arrays.stream(PackType.values())
                .filter(packType -> packType.getPackaging().getName().equalsIgnoreCase(name))
                .findAny().orElseThrow(() -> new IllegalArgumentException(String.format("Извините, упоковки \"%s\" нет в наличии!", name)));
        return result.getPackaging();
    }
}
