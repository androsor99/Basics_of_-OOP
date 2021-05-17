package com.androsor.basic_of_oop.task4.service.impl;

import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.service.ServiceException;
import com.androsor.basic_of_oop.task4.service.TreasureReport;

import java.util.Collections;
import java.util.List;

public class TreasureReportByRandomImpl implements TreasureReport {

    @Override
    public List<Treasure> getReport() throws ServiceException {
        List<Treasure> treasures;
        try {
            treasures = this.getTreasures();
        } catch (ServiceException e) {
            throw new ServiceException(e);
        }
        Collections.shuffle(treasures);
        return treasures;
    }
}
