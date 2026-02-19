package com.xworkz.transport;

public class Vehicle {
    // Parent attribute
    public String engineStatus = "Idle";

    // Parent method
    public void startEngine() {
        System.out.println("Invoking startEngine in Vehicle"); // Mandatory SOP
        this.engineStatus = "Running";
        System.out.println(">> [VEHICLE] Ignition on. Engine is now " + engineStatus);
    }
}