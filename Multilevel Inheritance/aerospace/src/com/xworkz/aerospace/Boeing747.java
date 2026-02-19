package com.xworkz.aerospace;

// Boeing747 'Is-A' CommercialPlane (Level 2 Inheritance)
public class Boeing747 extends CommercialPlane {

    // Child attribute
    public int seatingCapacity = 416;

    // Child method
    public void autoPilot() {
        System.out.println("Invoking autoPilot in Boeing747"); // Mandatory SOP
        System.out.println(">> [BOEING] Long-haul autopilot system engaged.");
    }
}