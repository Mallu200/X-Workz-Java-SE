package com.xworkz.security;

public class SecurityScanner {
    // Parent attribute: Defines the tool's scanning speed
    public String scanLevel = "Standard";

    // Parent method: Basic operation to check system connectivity
    public void scanNetwork() {
        System.out.println("Invoking scanNetwork in SecurityScanner"); // Mandatory SOP for tracking
        System.out.println(">> [BASE] Pinging network devices to check availability...");
    }
}