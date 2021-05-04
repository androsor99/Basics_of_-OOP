package com.androsor.basic_of_oop.task4.controller.impl;

import com.androsor.basic_of_oop.task4.controller.Command;

import static com.androsor.basic_of_oop.task4.controller.CommandProvider.EXIT_PROGRAM;

public class CommandExitImpl implements Command {

    @Override
    public void execute() {
        System.exit(EXIT_PROGRAM.getCode());
    }
}
