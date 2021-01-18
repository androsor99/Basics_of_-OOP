package com.androsor.basic_of_oop.task4.logic;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreasureSelect implements TreasureSelector {

    private int getMaxPrice (List<Treasure> treasures) {

        return Collections.max(treasures, Comparator.comparing(Treasure::getPrice)).getPrice();
    }

    @Override
    public Treasure getMostExpensiveTreasure(List<Treasure> treasures) {
        for (Treasure treasure : treasures) {
            if (treasure.getPrice() == getMaxPrice(treasures)){
                return treasure;
            }
        }
        return null;
    }

    @Override
    public List<Treasure> getListForAmount(List<Treasure> treasures, int amount) {

        List<Treasure> list = new ArrayList<>();

        for (Treasure treasure : treasures) {
            if (treasure.getPrice() <= amount) {
                list.add(treasure);
                amount -= treasure.getPrice();
            }
        }
        return list;
    }


}
