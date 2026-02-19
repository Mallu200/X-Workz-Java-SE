package com.xworkz.solar;

public class SolarRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in SolarRunner"); // Execution start log

        // Creating the Child object to demonstrate access to both Parent and Child members
        SolarPanel myPanel = new SolarPanel();

        System.out.println("Project: Solar Power Single Inheritance Testing");
        System.out.println("----------------------------------------------");

        // 1. Accessing inherited attribute and method from PowerSource
        System.out.println("Accessing capacityInMW attribute: " + myPanel.capacityInMW + " MW");
        myPanel.generateEnergy();

        // 2. Accessing unique attribute and method from SolarPanel
        System.out.println("Accessing panelType attribute: " + myPanel.panelType);
        myPanel.absorbSunlight();

        System.out.println("Main method ended successfully"); // Execution end log
    }
}