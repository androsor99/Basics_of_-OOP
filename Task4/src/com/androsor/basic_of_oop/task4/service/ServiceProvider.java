package com.androsor.basic_of_oop.task4.service;

import com.androsor.basic_of_oop.task4.service.impl.TreasureReportByRandomImpl;
import com.androsor.basic_of_oop.task4.service.impl.TreasureSelectByPriceImpl;

public final class  ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();
    private SelectionOfTreasures selectionByPrice = new TreasureSelectByPriceImpl();
    private TreasureReport reportByRandom = new TreasureReportByRandomImpl();

    public ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public SelectionOfTreasures getSelectionByPrice() {
        return selectionByPrice;
    }

    public void setSelectionByPrice(SelectionOfTreasures selectionByPrice) {
        this.selectionByPrice = selectionByPrice;
    }

    public TreasureReport getReportByRandom() {
        return reportByRandom;
    }

    public void setReportByRandom(TreasureReport reportByRandom) {
        this.reportByRandom = reportByRandom;
    }
}
