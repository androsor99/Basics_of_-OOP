package com.androsor.basic_of_oop.task5.dao.impl;

import com.androsor.basic_of_oop.task5.dao.DAOException;
import com.androsor.basic_of_oop.task5.dao.PackType;
import com.androsor.basic_of_oop.task5.dao.ProductDAO;
import com.androsor.basic_of_oop.task5.entity.Packaging;

public class PackagingDAOImpl implements ProductDAO<Packaging> {

    @Override
    public Packaging take(String packagingName) throws DAOException {
        try {
            return PackType.getPackagingByName(packagingName.strip());
        }  catch (IllegalArgumentException e) {
            throw new DAOException(e.getMessage());
        }
    }
}
