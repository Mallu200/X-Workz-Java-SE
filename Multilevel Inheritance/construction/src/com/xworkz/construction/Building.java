package com.xworkz.construction;

public class Building {
    // Grandparent attribute
    public String foundationType = "Reinforced Concrete";

    // Grandparent method
    public void layFoundation() {
        System.out.println("Invoking layFoundation in Building"); // Mandatory SOP
        System.out.println(">> [BASE] Setting the heavy-duty concrete foundation...");
    }
}