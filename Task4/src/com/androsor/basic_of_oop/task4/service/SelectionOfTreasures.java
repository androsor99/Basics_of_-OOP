package com.androsor.basic_of_oop.task4.service;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

public interface SelectionOfTreasures {

    /**
     * Returns a list of treasures selected by user parameter
     * @param amount option for selecting treasures.
     * @return treasure list.
     */
    List<Treasure> getTreasuresWorth(int amount) throws ServiceException;

    /**
     * Returns the most precious treasure.
     * @return Treasure Object.
     */
    Treasure getMostExpensiveTreasure() throws ServiceException;
}
