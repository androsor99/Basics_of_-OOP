package com.androsor.basic_of_oop.task5.dao;

import com.androsor.basic_of_oop.task5.entity.Product;

public interface ProductDAO<T extends Product> {

    /**
     * Forms a product based on the received parameters.
     * @param parameter product description.
     * @return object of class Product.
     * @throws DAOException
     */
    T take(String parameter) throws DAOException;
}
