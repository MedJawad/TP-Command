package com.ensa;

import com.ensa.appareils.Appareil1;
import com.ensa.appareils.Appareil2;
import com.ensa.appareils.Appareil3;
import com.ensa.appareils.IAppareil;
import com.ensa.commands.ICommand;
import com.ensa.commands.OffAppareilCommand;
import com.ensa.commands.OnAppareilCommand;

public class Main {

    public static void main(String[] args) {
        IAppareil appareil1 = new Appareil1();
        IAppareil appareil2 = new Appareil2();
        IAppareil appareil3 = new Appareil3();
        Invoker invoker = new Invoker();
        invoker.execute(new OnAppareilCommand(appareil1));
        invoker.execute(new OffAppareilCommand(appareil2));
        invoker.execute(new OnAppareilCommand(appareil2));
        invoker.undo();
        invoker.execute(new OffAppareilCommand(appareil1));
        invoker.execute(new OffAppareilCommand(appareil3));
        invoker.execute(new OnAppareilCommand(appareil3));
        invoker.undo();
        invoker.undo();
        invoker.undo();

    }
}
