package com.xworkz.automotive;

public class Vehicle {
    // Grandparent attribute
    public String fuelType = "Energy";

    // Grandparent method
    public void move() {
        System.out.println("Invoking move in Vehicle"); // Mandatory SOP
        System.out.println(">> [VEHICLE] Moving using mechanical force...");
    }
}