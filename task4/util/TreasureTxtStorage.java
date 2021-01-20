package com.androsor.basic_of_oop.task4.util;

import com.androsor.basic_of_oop.task4.entity.Treasure;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TreasureTxtStorage implements TreasureStorage{

    private final String NAME_PROPERTY_FILE = "src/com/androsor/basic_of_oop/task4/resource/config.properties";
    private final String KEY_PROPERTY_FILE = "Treasures";
    private final String LINE_SEPARATOR = System.getProperty("line.separator");
    private final String SEPARATOR = ",";


    private File getFileFromTreasure() throws IOException {

        Properties prop = new Properties();
        prop.load(new FileInputStream(new File(NAME_PROPERTY_FILE)));
        String pass = prop.getProperty(KEY_PROPERTY_FILE);
        return new File(pass);
    }

    @Override
    public void saveTreasureList(List<Treasure> treasures) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(getFileFromTreasure()));

        for(Treasure treasure : treasures) {
            bw.write(treasure.getName() + SEPARATOR + treasure.getPrice() + LINE_SEPARATOR);
        }
        bw.flush();
    }

    @Override
    public List<Treasure> loadTreasureList() throws IOException {
        List<Treasure> treasures = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(getFileFromTreasure()));
        String line;

        while((line = br.readLine()) != null) {
            String[] strTemp = line.split(SEPARATOR);
            Treasure treasure = new Treasure(strTemp[0], Integer.parseInt(strTemp[1]));
            treasures.add(treasure);
        }
        return treasures;
    }
}
