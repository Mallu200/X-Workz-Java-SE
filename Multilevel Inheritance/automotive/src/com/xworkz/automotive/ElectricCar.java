package com.xworkz.automotive;

// ElectricCar 'Is-A' FourWheeler (Level 2 Inheritance)
public class ElectricCar extends FourWheeler {

    // Child attribute
    public int batteryPercentage = 85;

    // Child method
    public void chargeBattery() {
        System.out.println("Invoking chargeBattery in ElectricCar"); // Mandatory SOP
        System.out.println(">> [EV] Plugged in. Current charge: " + batteryPercentage + "%");
    }
}