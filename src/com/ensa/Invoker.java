package com.ensa;

import com.ensa.commands.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<ICommand> appareilCommands
            = new ArrayList<>();

    public void execute(ICommand command) {
        command.execute();
        appareilCommands.add(command);
    }

    public void undo() {
        ICommand command = appareilCommands.get(appareilCommands.size() - 1);
        command.undo();
        appareilCommands.remove(appareilCommands.size() - 1);
    }

}
