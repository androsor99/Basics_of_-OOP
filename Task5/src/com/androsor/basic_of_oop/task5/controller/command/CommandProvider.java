package com.androsor.basic_of_oop.task5.controller.command;

import com.androsor.basic_of_oop.task5.controller.command.impl.CreateBouquetCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<String, Command> commands;

    public CommandProvider() {
        this.commands = new HashMap<>();
        this.commands.put("createBouquet", new CreateBouquetCommand());
    }

    public Command getCommand(String CommandName) {
        return commands.get(CommandName);
    }
}
