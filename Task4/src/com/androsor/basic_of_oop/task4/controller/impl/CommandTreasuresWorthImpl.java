package com.androsor.basic_of_oop.task4.controller.impl;

import com.androsor.basic_of_oop.task4.service.ServiceException;
import com.androsor.basic_of_oop.task4.view.Viewer;
import com.androsor.basic_of_oop.task4.controller.Command;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.service.SelectionOfTreasures;
import com.androsor.basic_of_oop.task4.service.ServiceProvider;
import com.androsor.basic_of_oop.task4.view.ViewerProvider;

import java.util.List;

import static com.androsor.basic_of_oop.task4.dao.util.IOHelper.getAmountFromUser;
import static com.androsor.basic_of_oop.task4.service.ServiceProvider.getInstance;

public class CommandTreasuresWorthImpl implements Command {

    private final ServiceProvider serviceProvider = getInstance();
    private final ViewerProvider viewerProvider = ViewerProvider.getInstance();

    @Override
    public void execute() {
        Viewer viewer = viewerProvider.getViewer();
        int amount = getAmountFromUser();
        SelectionOfTreasures selectionOfTreasures = serviceProvider.getSelectionByPrice();
        List<Treasure> result;
        try {
            result = selectionOfTreasures.getTreasuresWorth(amount);
            viewer.showAllTreasure(result);
        } catch (ServiceException e) {
            //logging e
            viewer.showMessage("Нешта здарылася");
        }
    }
}
