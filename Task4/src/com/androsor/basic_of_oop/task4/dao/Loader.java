package com.androsor.basic_of_oop.task4.dao;

import com.androsor.basic_of_oop.task4.entity.DragonCave;

public interface Loader {

    /**
     * Stores data about treasures.
     * @param cave An object containing a list of treasures.
     * @throws DAOException
     */
    void store(DragonCave cave) throws DAOException;

    /**
     * Gets treasures from resource.
     * @return An object containing a list of treasures.
     * @throws DAOException
     */
    DragonCave download() throws DAOException;
}
