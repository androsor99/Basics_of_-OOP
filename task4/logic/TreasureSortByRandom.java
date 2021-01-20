package com.androsor.basic_of_oop.task4.logic;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.Collections;
import java.util.List;

public class TreasureSortByRandom implements TreasureSorter {
    @Override
    public List<Treasure> sort(List<Treasure> treasures) {
        Collections.shuffle(treasures);
        return treasures;
    }
}
