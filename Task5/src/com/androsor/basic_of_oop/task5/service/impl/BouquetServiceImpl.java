package com.androsor.basic_of_oop.task5.service.impl;

import com.androsor.basic_of_oop.task5.dao.DAOException;
import com.androsor.basic_of_oop.task5.dao.DAOProvider;
import com.androsor.basic_of_oop.task5.dao.ProductDAO;
import com.androsor.basic_of_oop.task5.entity.BouquetOffFlowers;
import com.androsor.basic_of_oop.task5.entity.Flower;
import com.androsor.basic_of_oop.task5.entity.Packaging;
import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.service.BouquetService;
import com.androsor.basic_of_oop.task5.service.ServiceException;
import com.androsor.basic_of_oop.task5.service.util.Validator;

import java.util.Map;

public class BouquetServiceImpl implements BouquetService {

    private final DAOProvider daoProvider = DAOProvider.getInstance();

    @Override
    public boolean addFlower(BouquetOffFlowers bouquet, String flowerName, int quantity) throws ServiceException {
        try {
            ProductDAO<Flower> productDAO = daoProvider.getFlowerDAO();
            Flower current = productDAO.take(flowerName.strip());
            Map<Product, Integer> flowers = bouquet.getFlowers();
            if (flowers.containsKey(current)) {
                flowers.put(current, (flowers.get(current) + quantity));
            } else {
                flowers.put(current, quantity);
            }
            return true;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public boolean removeFlower(BouquetOffFlowers bouquet, String flowerName, int quantity) throws ServiceException {
        try {
            ProductDAO<Flower> productDAO = daoProvider.getFlowerDAO();
            Flower current = productDAO.take(flowerName.strip());
            Map<Product, Integer> flowers = bouquet.getFlowers();
            if (flowers.containsKey(current)) {
                flowers.remove(current, quantity);
                return true;
            } else return false;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public boolean toChangePackaging(BouquetOffFlowers bouquet, String packagingName) throws ServiceException {
        try {
            ProductDAO<Packaging> productDAO = daoProvider.getPackagingDAO();
            Packaging current = productDAO.take(packagingName.strip());
            bouquet.setPack(current);
            return true;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public BouquetOffFlowers create(String name) throws ServiceException {
        if (!Validator.validName(name.strip())) {
            throw new ServiceException("Слишком длинное название букета");
        }
        return new BouquetOffFlowers(name.strip());
    }
}
