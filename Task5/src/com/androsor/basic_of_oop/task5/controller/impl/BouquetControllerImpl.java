package com.androsor.basic_of_oop.task5.controller.impl;

import com.androsor.basic_of_oop.task5.controller.Controller;
import com.androsor.basic_of_oop.task5.controller.command.Command;
import com.androsor.basic_of_oop.task5.controller.command.CommandProvider;
import com.androsor.basic_of_oop.task5.service.ServiceException;

public class BouquetControllerImpl implements Controller {

    private final CommandProvider commandProvider = new CommandProvider();

    @Override
    public String doAction(String request) {
        String[] params =  request.split("\s+");
        String commandName = params[0];
        Command command = commandProvider.getCommand(commandName);
        String response;
        try {
            response = command.execute(params);
        } catch (ServiceException e) {
            // logging e
            response = e.getMessage();
        }
        return response;
    }
}
