package com.xworkz.aerospace;

public class Aircraft {
    // Grandparent attribute
    public String medium = "Air";

    // Grandparent method
    public void fly() {
        System.out.println("Invoking fly in Aircraft"); // Mandatory SOP
        System.out.println(">> [AIRCRAFT] Generating lift and ascending into the sky...");
    }
}