package com.androsor.basic_of_oop.task5.entity.pack;

import com.androsor.basic_of_oop.task5.entity.Product;
import java.io.Serializable;
import java.util.Objects;

public class Pack implements Serializable, Product {

    private static final long serialVersionUID = 5708147148725333175L;
    private final String name;
    private final double price;
    private PackType packType;


    public Pack() {
        this.name = "Без упаковки";
        this.price = 0;
    }

    public Pack(PackType packType) {
        this.packType = packType;
        this.name = packType.getName();
        this.price = packType.getPrice();
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pack pack = (Pack) o;
        return Double.compare(pack.price, price) == 0 &&
                name.equals(pack.name) &&
                packType == pack.packType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, packType);
    }

    @Override
    public String toString() {
        return "Pack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", packType=" + packType +
                '}';
    }
}
