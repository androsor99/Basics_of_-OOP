package com.androsor.basic_of_oop.task4.service;

import com.androsor.basic_of_oop.task4.dao.DAOException;
import com.androsor.basic_of_oop.task4.dao.DAOProvider;
import com.androsor.basic_of_oop.task4.dao.DragonCaveDAO;
import com.androsor.basic_of_oop.task4.entity.Treasure;

import java.util.List;

import static com.androsor.basic_of_oop.task4.dao.DAOProvider.getInstance;

public interface TreasureReport {

    DAOProvider provider = getInstance();

    /**
     * Returns a sorted list of treasures.
     * @return list of treasures.
     */
    List<Treasure> getReport() throws ServiceException;

    default List<Treasure> getTreasures() throws ServiceException {
        DragonCaveDAO caveDao = provider.getDragonCaveDAO();
        try {
            return caveDao.findAll();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

}

