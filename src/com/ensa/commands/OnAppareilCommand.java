package com.ensa.commands;

import com.ensa.appareils.IAppareil;

public class OnAppareilCommand implements ICommand{
    IAppareil appareil;

    public OnAppareilCommand(IAppareil appareil) {
        this.appareil = appareil;
    }

    @Override
    public void execute() {
        appareil.on();
    }

    @Override
    public void undo() {
        System.out.println("UNDOING ON");
        appareil.off();
    }
}
