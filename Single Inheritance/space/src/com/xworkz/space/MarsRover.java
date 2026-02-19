package com.xworkz.space;

// MarsRover 'Is-A' Spacecraft
public class MarsRover extends Spacecraft {
    // Unique child attribute: Specific to planetary explorers
    public double cameraResolution = 48.0;

    // Unique child method: Advanced feature for surface exploration
    public void collectSoilSample() {
        System.out.println("Invoking collectSoilSample in MarsRover"); // Method entry log
        System.out.println(">> [SCIENCE] Robotic arm drilling into Martian rock for samples...");
    }
}