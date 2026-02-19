package com.xworkz.space;

public class Spacecraft {
    // Parent attribute: Shared across all space-faring vessels
    public String powerSource = "Nuclear Radioisotope Generator";

    // Parent method: Basic function to send data back to Earth
    public void transmitSignals() {
        System.out.println("Invoking transmitSignals in Spacecraft"); // Mandatory SOP for flow tracking
        System.out.println(">> [COMMS] Sending telemetry data to Deep Space Network...");
    }
}