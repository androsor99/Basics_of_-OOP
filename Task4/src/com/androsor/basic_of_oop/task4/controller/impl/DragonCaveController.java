package com.androsor.basic_of_oop.task4.controller.impl;

import com.androsor.basic_of_oop.task4.controller.Command;
import com.androsor.basic_of_oop.task4.controller.Controller;

import static com.androsor.basic_of_oop.task4.controller.CommandProvider.getItemCode;

public class DragonCaveController implements Controller {

    @Override
    public void doAction(int request) {
        Command currentCommand = getItemCode(request).getCommand();
        currentCommand.execute();
    }
}
