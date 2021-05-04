package com.androsor.basic_of_oop.task4.controller.impl;

import com.androsor.basic_of_oop.task4.service.ServiceException;
import com.androsor.basic_of_oop.task4.view.Viewer;
import com.androsor.basic_of_oop.task4.controller.Command;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.service.SelectionOfTreasures;

public class CommandMostExpensiveTreasureImpl implements Command {

    @Override
    public void execute() {
        SelectionOfTreasures selectionOfTreasures = serviceProvider.getSelectionByPrice();
        Treasure result;
        Viewer viewer = viewerProvider.getViewer();
        try {
            result = selectionOfTreasures.getMostExpensiveTreasure();
            viewer.showTreasure(result);
        } catch (ServiceException e) {
            //logging e
            viewer.showMessage("Нешта здарылася");
        }
    }
}
