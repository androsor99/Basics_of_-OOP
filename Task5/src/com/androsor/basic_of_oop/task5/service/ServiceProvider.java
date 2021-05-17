package com.androsor.basic_of_oop.task5.service;

import com.androsor.basic_of_oop.task5.service.impl.BouquetServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();
    private BouquetService bouquetService = new BouquetServiceImpl();

    public ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public BouquetService getBouquetService() {
        return bouquetService;
    }

    public void setBouquetService(BouquetService bouquetService) {
        this.bouquetService = bouquetService;
    }
}
