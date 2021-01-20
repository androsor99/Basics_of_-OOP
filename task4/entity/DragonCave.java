package com.androsor.basic_of_oop.task4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable {

    private static final long serialVersionUID = -2702099045569449368L;
    private String nameDragon;
    private List<Treasure> treasures;

    {
        nameDragon = "Пещера Усатого Таракана";
    }

    public DragonCave() {
    }

    public DragonCave(String nameDragon) {
        this.nameDragon = nameDragon;
        this.treasures = new ArrayList<Treasure>();
    }

    public String getNameDragon() {
        return nameDragon;
    }

    public void setNameDragon(String nameDragon) {
        this.nameDragon = nameDragon;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonCave that = (DragonCave) o;
        return nameDragon.equals(that.nameDragon) &&
                treasures.equals(that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDragon, treasures);
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "nameDragon='" + nameDragon + '\'' +
                ", treasures=" + treasures +
                '}';
    }
}
