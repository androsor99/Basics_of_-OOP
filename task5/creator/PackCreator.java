package com.androsor.basic_of_oop.task5.creator;

import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.entity.pack.Pack;
import com.androsor.basic_of_oop.task5.entity.pack.PackType;

import java.util.Objects;

public class PackCreator implements Creator{

    @Override
    public Product createProduct(String name) {

        try {
            return new Pack(Objects.requireNonNull(PackType.getPackTypeByName(name)));
        } catch (NullPointerException e1) {
            throw new NullPointerException(String.format("Извините, упоковки \"%s\" нет в наличии!", name));
        }
    }
}
