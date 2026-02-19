package com.xworkz.telecom;

public class ElectronicDevice {
    // Grandparent attribute
    public boolean isPowered = true;

    // Grandparent method
    public void consumeEnergy() {
        System.out.println("Invoking consumeEnergy in ElectronicDevice"); // Mandatory SOP
        System.out.println(">> [ENERGY] Device is drawing power from battery.");
    }
}