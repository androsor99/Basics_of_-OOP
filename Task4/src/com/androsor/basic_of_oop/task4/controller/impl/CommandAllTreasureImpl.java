package com.androsor.basic_of_oop.task4.controller.impl;

import com.androsor.basic_of_oop.task4.service.ServiceException;
import com.androsor.basic_of_oop.task4.view.Viewer;
import com.androsor.basic_of_oop.task4.controller.Command;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.service.TreasureReport;

import java.util.List;

public class CommandAllTreasureImpl implements Command {

    @Override
    public void execute() {
        Viewer viewer = viewerProvider.getViewer();
        TreasureReport report = serviceProvider.getReportByRandom();
        List<Treasure> result;
        try {
            result = report.getReport();
            viewer.showAllTreasure(result);
        } catch (ServiceException e) {
            //logging e
           viewer.showMessage("Нешта здарылася");
        }

    }
}
