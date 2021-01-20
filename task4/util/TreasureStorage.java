package com.androsor.basic_of_oop.task4.util;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.io.IOException;
import java.util.List;

public interface TreasureStorage {

    void saveTreasureList(List<Treasure> treasures) throws IOException;
    List<Treasure> loadTreasureList() throws IOException;
}
