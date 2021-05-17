package com.androsor.basic_of_oop.task5.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BouquetOffFlowers extends Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 4418193119780208689L;
    private Map<Product, Integer> flowers;
    private Packaging packaging;


    public BouquetOffFlowers(String name) {
        super(name, 0);
        this.flowers = new HashMap<>();
        this.packaging = new Packaging();
    }

    public BouquetOffFlowers(Map<Product, Integer> flowers, Packaging packaging) {
        super();
        this.flowers = flowers;
        this.packaging = packaging;
    }

    public BouquetOffFlowers(String name, double price, Map<Product, Integer> flowers, Packaging packaging) {
        super(name, price);
        this.flowers = flowers;
        this.packaging = packaging;
    }

    public Map<Product, Integer> getFlowers() {
        return flowers;
    }

    public void setFlowers(Map<Product, Integer> flowers) {
        this.flowers = flowers;
    }

    public Packaging getPack() {
        return packaging;
    }

    public void setPack(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public double getPrice() {
        double totalPrice = this.packaging.getPrice();
        for (Product flower : flowers.keySet()){
            if (flower == null) continue;
            totalPrice = flower.getPrice() * this.flowers.get(flower);
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BouquetOffFlowers that = (BouquetOffFlowers) o;
        return Objects.equals(flowers, that.flowers) && Objects.equals(packaging, that.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flowers, packaging);
    }

    @Override
    public String toString() {
        return "BouquetOffFlowers{" +
                super.toString() +
                "flowers=" + flowers +
                ", packaging=" + packaging +
                "} ";
    }
}
