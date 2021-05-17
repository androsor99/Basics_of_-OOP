package com.androsor.basic_of_oop.task5.dao.impl;

import com.androsor.basic_of_oop.task5.dao.DAOException;
import com.androsor.basic_of_oop.task5.dao.FlowerType;
import com.androsor.basic_of_oop.task5.dao.ProductDAO;
import com.androsor.basic_of_oop.task5.entity.Flower;

public class FlowerDAOImpl implements ProductDAO<Flower> {

    @Override
    public Flower take(String flowerName) throws DAOException {
        try {
            return FlowerType.getFlowerByName(flowerName.strip());
        }  catch (IllegalArgumentException e) {
            throw new DAOException(e.getMessage());
        }
    }
}
