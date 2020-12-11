package com.ensa.commands;

import com.ensa.appareils.IAppareil;

public class OffAppareilCommand implements ICommand{
    IAppareil appareil;

    public OffAppareilCommand(IAppareil appareil) {
        this.appareil = appareil;
    }

    @Override
    public void execute() {
        appareil.off();
    }
    @Override
    public void undo() {
        System.out.println("UNDOING OFF");
        appareil.on();
    }
}
