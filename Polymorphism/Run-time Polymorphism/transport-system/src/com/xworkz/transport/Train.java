package com.xworkz.transport;

public class Train extends Vehicle {

    @Override
    public void move() {
        System.out.println("Invoking move in Train");
        System.out.println(">> The Train is gliding on the railway tracks.");
    }
}
