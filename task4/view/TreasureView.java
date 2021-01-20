package com.androsor.basic_of_oop.task4.view;

import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import java.util.List;

public class TreasureView {

    public void showListHeader() {
        System.out.printf("| %-35s | %-10s |\n", "СОКРОВИЩЕ", "СТОИМОСТЬ");
        System.out.print("------------------------------------------------------------------\n");
    }

    public void showTreasure(Treasure treasure) {
        System.out.printf("| %-35s | %4d монет |\n", treasure.getName(), treasure.getPrice());
    }

    public void showTreasureCaveName(DragonCave dragonCave) {
        System.out.printf("|\t\t\t%-38s |\n\n", dragonCave.getNameDragon());
    }

    public void showTreasureList(List<Treasure> treasures) {
        showListHeader();
        for(Treasure treasure : treasures) {
            showTreasure(treasure);
        }
        System.out.print("------------------------------------------------------------------\n");
    }

    public void showMessageAboutAmount() {
        System.out.print("Укажите сумму, на которую подобрать сокровища:\n");
    }
}
