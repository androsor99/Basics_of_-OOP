package com.androsor.basic_of_oop.task4.view;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

public interface Viewer {

    /**
     * Shows a list of all treasures.
     * @param treasures list treasures.
     */
    void showAllTreasure(List<Treasure> treasures);

    /**
     * Shows an investment treasure.
     * @param treasure object Treasure.
     */
    void showTreasure(Treasure treasure);

    void showMessage(String line);
}
