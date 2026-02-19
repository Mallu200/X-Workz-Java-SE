package com.xworkz.solar;

public class PowerSource {
    // Parent attribute: Represents the general capacity of any energy source
    public int capacityInMW = 500;

    // Parent method: General action performed by any power generator
    public void generateEnergy() {
        System.out.println("Invoking generateEnergy in PowerSource"); // Mandatory SOP for flow tracking
        System.out.println(">> [SOURCE] Converting resource into electricity...");
    }
}