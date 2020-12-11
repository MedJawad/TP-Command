package com.ensa.appareils;

public class Appareil1 implements IAppareil {
    @Override
    public String on() {
        System.out.println("ON 1");
        return "ON 1";
    }

    @Override
    public void off() {
        System.out.println("OFF 1");
    }
}
