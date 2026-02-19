package com.xworkz.automotive;

// FourWheeler 'Is-A' Vehicle (Level 1 Inheritance)
public class FourWheeler extends Vehicle {

    // Parent method
    public void steer() {
        System.out.println("Invoking steer in FourWheeler"); // Mandatory SOP
        System.out.println(">> [4-WHEELER] Controlling direction with a steering wheel.");
    }
}