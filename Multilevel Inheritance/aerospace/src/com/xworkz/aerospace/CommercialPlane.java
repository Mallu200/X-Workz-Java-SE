package com.xworkz.aerospace;

// CommercialPlane 'Is-A' Aircraft (Level 1 Inheritance)
public class CommercialPlane extends Aircraft {

    // Parent method
    public void cabinPressure() {
        System.out.println("Invoking cabinPressure in CommercialPlane"); // Mandatory SOP
        System.out.println(">> [CABIN] Maintaining oxygen levels for passengers.");
    }
}