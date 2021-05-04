package com.androsor.basic_of_oop.task4.dao;

import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String SEPARATOR = ",";

    public List<Treasure> readFromStorage(BufferedReader bufferedReader) throws DAOException{
        List<Treasure> treasures = new ArrayList<>();
        String line;
        while(true) {
            try {
                if ((line = bufferedReader.readLine()) == null) break;
                String[] strTemp = line.split(SEPARATOR);
                Treasure treasure = new Treasure(strTemp[0],
                        Integer.parseInt(strTemp[1]));
                treasures.add(treasure);
            } catch (IOException e) {
                throw new DAOException(e);
            }
        }
        return treasures;
    }

    public void writeToStorage(BufferedWriter bufferedWriter, List<Treasure> treasures) throws DAOException {
        for(Treasure treasure : treasures) {
            try {
                bufferedWriter.write(treasure.getName() + SEPARATOR + treasure.getPrice() + LINE_SEPARATOR);
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new DAOException(e);
            }
        }
    }
}
