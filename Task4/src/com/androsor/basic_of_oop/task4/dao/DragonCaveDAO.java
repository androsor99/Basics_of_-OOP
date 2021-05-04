package com.androsor.basic_of_oop.task4.dao;

import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

public interface DragonCaveDAO {

    /**
     * Сreates a new object DragonCave.
     * @return object DragonCave.
     * @throws DAOException
     */
    DragonCave create() throws DAOException;

    /**
     * Returns a list of treasures.
     * @return treasure list.
     * @throws DAOException
     */
    List<Treasure> findAll() throws DAOException;

    /**
     * Returns a list of treasures selected by user parameter
     * @param amount option for selecting treasures.
     * @return treasure list.
     * @throws DAOException
     */
    List<Treasure> findFromAmount(int amount) throws DAOException;

    /**
     * Removes treasure from storage
     * @param nameTreasure option for deleting treasures.
     * @return result of execution.
     * @throws DAOException
     */
    boolean delete(String nameTreasure) throws DAOException;

    /**
     * replaces treasure in storage.
     * @param treasure Treasure Object
     * @return result of execution.
     * @throws DAOException
     */
    boolean update(Treasure treasure) throws DAOException;

    /**
     * Returns the most precious treasure.
     * @return Treasure Object.
     * @throws DAOException
     */
    Treasure findMostExpensiveTreasure() throws DAOException;

    /**
     * Stores data about treasures.
     * @param cave An object containing a list of treasures.
     * @throws DAOException
     */
    void store(DragonCave cave) throws DAOException;
}
