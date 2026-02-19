package com.xworkz.bird;

public class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Invoking fly in Eagle");
        System.out.println(">> The Eagle soars at high altitudes using thermal currents.");
    }
}