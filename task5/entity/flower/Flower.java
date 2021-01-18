package com.androsor.basic_of_oop.task5.entity.flower;

import com.androsor.basic_of_oop.task5.entity.Product;
import java.io.Serializable;
import java.util.Objects;

/**
 * Class Flower. Describes flower.
 * @author Andrei Soroka
 */

public class Flower implements Serializable, Product {

    private static final long serialVersionUID = 5890870495424358934L;
    private final String name;
    private final double price;
    private final FlowerType flowerType;


    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        this.name = flowerType.getName();
        this.price = flowerType.getPrice();
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0 &&
                name.equals(flower.name) &&
                flowerType == flower.flowerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, flowerType);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flowerType=" + flowerType +
                '}';
    }
}
