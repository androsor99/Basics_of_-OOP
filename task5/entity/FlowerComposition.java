package com.androsor.basic_of_oop.task5.entity;

import com.androsor.basic_of_oop.task5.entity.pack.Pack;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class FlowerComposition implements Serializable, Product {

    private static final long serialVersionUID = 4418193119780208689L;
    private final Map<Product, Integer> flowers;
    private final Pack pack;

    public FlowerComposition(Map<Product, Integer> flowers, Pack pack) {
        this.flowers = flowers;
        this.pack = pack;
    }

    @Override
    public String getName() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ваш букет:\n");
        sb.append("Вид упаковки - '").append(pack.getName()).append("'.\n");

        for (Product flower : flowers.keySet()){
            if (flower == null) continue;
            sb.append('\'').append(flower.getName()).append('\'');
            sb.append(" - ").append(flowers.get(flower)).append(" шт.,\n");
        }

        sb.append("Общая стоимость - ").append(String.format("%.2f", getPrice()));
        sb.append(" $.");
        return sb.toString();
    }

    @Override
    public double getPrice() {
        double totalPrice = pack.getPrice();
        for (Product flower : flowers.keySet()){
            if (flower == null) continue;
            totalPrice = flower.getPrice() * flowers.get(flower);
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerComposition that = (FlowerComposition) o;
        return flowers.equals(that.flowers) &&
                pack.equals(that.pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers, pack);
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowers=" + flowers +
                ", pack=" + pack +
                '}';
    }
}
