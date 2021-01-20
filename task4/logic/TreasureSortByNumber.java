package com.androsor.basic_of_oop.task4.logic;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.Comparator;
import java.util.List;

public class TreasureSortByNumber implements TreasureSorter{
    @Override
    public List<Treasure> sort(List<Treasure> treasures) {
        treasures.sort(Comparator.comparing(Treasure::getName));
        return treasures;
    }
}
