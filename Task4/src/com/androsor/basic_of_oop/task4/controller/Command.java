package com.androsor.basic_of_oop.task4.controller;

import com.androsor.basic_of_oop.task4.service.ServiceProvider;
import com.androsor.basic_of_oop.task4.view.ViewerProvider;

import static com.androsor.basic_of_oop.task4.service.ServiceProvider.getInstance;

public interface Command {

    ServiceProvider serviceProvider = getInstance();
    ViewerProvider viewerProvider = ViewerProvider.getInstance();

    /**
     * Executes the command.
     */
    void execute();
}
