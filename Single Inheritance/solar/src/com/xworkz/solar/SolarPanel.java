package com.xworkz.solar;

// Using 'extends' to inherit PowerSource properties into the Solar specialization
public class SolarPanel extends PowerSource {
    // Unique child attribute: Specific to solar technology
    public String panelType = "Monocrystalline";

    // Unique child method: Specific behavior for solar energy capture
    public void absorbSunlight() {
        System.out.println("Invoking absorbSunlight in SolarPanel"); // Method entry log
        System.out.println(">> [SOLAR] Silicon cells are absorbing photons from the sun...");
    }
}