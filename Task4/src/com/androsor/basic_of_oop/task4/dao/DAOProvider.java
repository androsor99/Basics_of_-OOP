package com.androsor.basic_of_oop.task4.dao;

import com.androsor.basic_of_oop.task4.dao.impl.FileDragonCaveDAOImpl;

public final class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();
    private DragonCaveDAO dragonCaveDAO = new FileDragonCaveDAOImpl();

    public DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public DragonCaveDAO getDragonCaveDAO() {
        return dragonCaveDAO;
    }

    public void setDragonCaveDAO(DragonCaveDAO dragonCaveDAO) {
        this.dragonCaveDAO = dragonCaveDAO;
    }
}

