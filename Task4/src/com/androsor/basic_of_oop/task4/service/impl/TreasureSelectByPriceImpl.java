package com.androsor.basic_of_oop.task4.service.impl;

import com.androsor.basic_of_oop.task4.dao.DAOException;
import com.androsor.basic_of_oop.task4.dao.DAOProvider;
import com.androsor.basic_of_oop.task4.dao.DragonCaveDAO;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.service.SelectionOfTreasures;
import com.androsor.basic_of_oop.task4.service.ServiceException;

import java.util.List;

import static com.androsor.basic_of_oop.task4.dao.DAOProvider.getInstance;

public class TreasureSelectByPriceImpl implements SelectionOfTreasures {

    private final DAOProvider provider = getInstance();

    @Override
    public Treasure getMostExpensiveTreasure() throws ServiceException {
       DragonCaveDAO caveDao = provider.getDragonCaveDAO();
        try {
            return caveDao.findMostExpensiveTreasure();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public List<Treasure> getTreasuresWorth(int amount) throws ServiceException {
        DragonCaveDAO caveDao = provider.getDragonCaveDAO();
        try {
            return caveDao.findFromAmount(amount);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
