package com.androsor.basic_of_oop.task5.creator;

import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.entity.flower.Flower;
import com.androsor.basic_of_oop.task5.entity.flower.FlowerType;

import java.util.Objects;

public class FlowerCreator implements Creator {

    @Override
    public Product createProduct(String name) {

        try {
            return new Flower(Objects.requireNonNull(FlowerType.getFlowerTypeByName(name)));
        } catch (NullPointerException e1) {
            throw new NullPointerException(String.format("Извините, цветов \"%s\" нет в наличии!", name));
        }
   }
}
