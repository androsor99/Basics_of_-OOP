package com.androsor.basic_of_oop.task4.source;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileStorage {

    private static final String NAME_PROPERTY_FILE = "src/com/androsor/basic_of_oop/task4/source/config.properties";
    private static final String KEY_PROPERTY_FILE = "Treasures";
    private static final Properties prop = new Properties();

    public File getFileFromTreasure() throws IOException {
        String pass = "";
            prop.load(new FileInputStream(NAME_PROPERTY_FILE));
            pass = prop.getProperty(KEY_PROPERTY_FILE);
        return new File(pass);
    }
}
