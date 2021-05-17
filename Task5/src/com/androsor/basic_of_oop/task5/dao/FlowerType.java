package com.androsor.basic_of_oop.task5.dao;

import com.androsor.basic_of_oop.task5.entity.Flower;

import java.util.Arrays;

public enum FlowerType {

    ROSE(new Flower("Роза", 7.70)),
    CARNATION(new Flower("Гвоздика", 6.60)),
    TULIP(new Flower("Тюльпан", 5.50)),
    IRISES(new Flower("Ирисы", 4.40)),
    CHRYSANTHEMUM(new Flower("Хризонтема", 3.30)),
    CHAMOMILE(new Flower("Ромашишка", 2.20));

    private final Flower flower;

    FlowerType(Flower flower) {
        this.flower = flower;
    }

    public Flower getFlower() {
        return flower;
    }

    public static Flower getFlowerByName(String name) {
        FlowerType result = Arrays.stream(FlowerType.values())
                .filter(flowerType -> flowerType.getFlower().getName().equalsIgnoreCase(name))
                .findAny().orElseThrow(() -> new IllegalArgumentException(String.format("Извините, цветов \"%s\" нет в наличии!", name)));
        return result.getFlower();
    }
}
