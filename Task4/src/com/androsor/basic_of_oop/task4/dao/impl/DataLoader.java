package com.androsor.basic_of_oop.task4.dao.impl;

import com.androsor.basic_of_oop.task4.dao.DAOException;
import com.androsor.basic_of_oop.task4.dao.Parser;
import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.source.FileStorage;
import com.androsor.basic_of_oop.task4.dao.Loader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader implements Loader {
    private static final FileStorage storage = new FileStorage();
    private static final Parser parser = new Parser();

    @Override
    public void store(DragonCave cave) throws DAOException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(storage.getFileFromTreasure()))) {
            parser.writeToStorage(bufferedWriter, cave.getTreasures());
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public DragonCave download() throws DAOException {
        List<Treasure> treasures = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(storage.getFileFromTreasure()))) {
            treasures.addAll(parser.readFromStorage(bufferedReader));
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return new DragonCave(treasures);
    }
}
