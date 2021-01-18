package com.androsor.basic_of_oop.task5.creator;

import com.androsor.basic_of_oop.task5.entity.Product;

/**
 * Unified interface for product creators.
 */
public interface Creator {

    /**
     * Creates and returns product by name.
     * @param  name product
     * @return Returns product class {@link Product}
     */
    Product createProduct(String  name);
}
