package com.xworkz.space;

public class SpaceRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in SpaceRunner"); // Execution start log

        // Creating the Child object to demonstrate access to both Parent and Child members
        MarsRover perseverance = new MarsRover();

        System.out.println("Project: Space Exploration Single Inheritance Testing");
        System.out.println("-------------------------------------------------");

        // 1. Using functionality inherited from the Parent (Spacecraft)
        System.out.println("Power System: " + perseverance.powerSource);
        perseverance.transmitSignals();

        // 2. Using specialized functionality from the Child (MarsRover)
        System.out.println("Camera Capability: " + perseverance.cameraResolution + " Megapixels");
        perseverance.collectSoilSample();

        System.out.println("Main method ended successfully"); // Execution end log
    }
}