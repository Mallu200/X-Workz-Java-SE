package com.xworkz.transport;

public class Flight extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Invoking startEngine in Flight");
        System.out.println(">> Jet engines ignited. Systems clear.");
    }

    @Override
    public void move() {
        System.out.println("Invoking move in Flight");
        System.out.println(">> The Flight is cruising at 35,000 feet.");
    }
}