package com.androsor.basic_of_oop.task5.service;

import com.androsor.basic_of_oop.task5.entity.BouquetOffFlowers;

public interface BouquetService {
    /**
     * creates bouquet with the specified name.
     * @param name name for the bouquet
     * @return class object BouquetOffFlowers.
     * @throws ServiceException
     */
    BouquetOffFlowers create(String name) throws ServiceException;

    /**
     * Adds a certain amount of flowers to the bouquet.
     * @param bouquet class object BouquetOffFlowers.
     * @param flowerName flower name.
     * @param quantity number of flowers.
     * @return class object BouquetOffFlowers.
     * @throws ServiceException
     */
    boolean addFlower(BouquetOffFlowers bouquet, String flowerName, int quantity) throws ServiceException;

    /**
     * Removes a certain amount of flowers to the bouquet.
     * @param bouquet class object BouquetOffFlowers.
     * @param flowerName flower name.
     * @param quantity number of flowers.
     * @return class object BouquetOffFlowers.
     * @throws ServiceException
     */
    boolean removeFlower(BouquetOffFlowers bouquet, String flowerName, int quantity) throws ServiceException;

    /**
     * Changes the packaging in the bouquet
     * @param bouquet class object BouquetOffFlowers.
     * @param packagingName packaging name.
     * @return class object BouquetOffFlowers.
     * @throws ServiceException
     */
    boolean toChangePackaging(BouquetOffFlowers bouquet, String packagingName) throws ServiceException;
}
