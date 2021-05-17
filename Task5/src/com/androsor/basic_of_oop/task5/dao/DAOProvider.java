package com.androsor.basic_of_oop.task5.dao;

import com.androsor.basic_of_oop.task5.dao.impl.FlowerDAOImpl;
import com.androsor.basic_of_oop.task5.dao.impl.PackagingDAOImpl;
import com.androsor.basic_of_oop.task5.entity.Flower;
import com.androsor.basic_of_oop.task5.entity.Packaging;

public class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();
    private ProductDAO<Flower> flowerDAO = new FlowerDAOImpl();
    private ProductDAO<Packaging> packagingDAO = new PackagingDAOImpl();

    public DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public ProductDAO<Flower> getFlowerDAO() {
        return flowerDAO;
    }

    public void setFlowerDAO(ProductDAO<Flower> flowerDAO) {
        this.flowerDAO = flowerDAO;
    }

    public ProductDAO<Packaging> getPackagingDAO() {
        return packagingDAO;
    }

    public void setPackagingDAO(ProductDAO<Packaging> packagingDAO) {
        this.packagingDAO = packagingDAO;
    }
}
