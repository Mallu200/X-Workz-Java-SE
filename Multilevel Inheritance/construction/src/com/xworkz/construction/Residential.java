package com.xworkz.construction;

// Residential 'Is-A' Building (Level 1 Inheritance)
public class Residential extends Building {

    // Parent method
    public void connectUtilities() {
        System.out.println("Invoking connectUtilities in Residential"); // Mandatory SOP
        System.out.println(">> [UTILITY] Linking water, electricity, and gas lines.");
    }
}