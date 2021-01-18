package com.androsor.basic_of_oop.task4.logic;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

public interface TreasureSelector {

    Treasure getMostExpensiveTreasure(List<Treasure> treasures);
    List<Treasure> getListForAmount(List<Treasure> treasures, int amount);

}
