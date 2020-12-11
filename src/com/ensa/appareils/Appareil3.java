package com.ensa.appareils;

public class Appareil3 implements IAppareil {
    @Override
    public String on() {
        System.out.println("ON 3");
        return "ON 3";
    }

    @Override
    public void off() {
        System.out.println("OFF 3");
    }
}
