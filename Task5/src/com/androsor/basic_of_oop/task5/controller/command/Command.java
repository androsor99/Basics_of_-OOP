package com.androsor.basic_of_oop.task5.controller.command;

import com.androsor.basic_of_oop.task5.service.ServiceException;

public interface Command {

    /**
     * Executes a specific command with the received parameters
     * @param parameters array of strings with parameters.
     * @return formatting string
     * @throws ServiceException
     */
    String execute(String[] parameters) throws ServiceException;
}
