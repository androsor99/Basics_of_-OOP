package com.androsor.basic_of_oop.task4.dao;

import com.androsor.basic_of_oop.task4.dao.impl.DataLoader;

public final class SourceConnector {

    private static final SourceConnector instance = new SourceConnector();
    private Loader loader = new DataLoader();

    public SourceConnector() {
    }

    public static SourceConnector getInstance() {
        return instance;
    }

    public Loader getLoader() {
        return loader;
    }

    public void setLoader(Loader loader) {
        this.loader = loader;
    }
}
