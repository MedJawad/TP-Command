package com.ensa.appareils;

public class Appareil2 implements IAppareil {
    @Override
    public String on() {
        System.out.println("ON 2");
        return null;
    }

    @Override
    public void off() {
        System.out.println("OFF 2");
    }
}
