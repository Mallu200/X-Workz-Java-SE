package com.xworkz.security;

public class SecurityRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in SecurityRunner"); // Execution start log

        // Creating the Child object
        VulnerabilityScanner myScanner = new VulnerabilityScanner();

        System.out.println("Project: Cybersecurity Single Inheritance Testing");
        System.out.println("----------------------------------------------");

        // 1. Using functionality inherited from the Parent
        System.out.println("Scan Level: " + myScanner.scanLevel);
        myScanner.scanNetwork();

        // 2. Using specialized functionality from the Child
        System.out.println("Threat Database Version: " + myScanner.databaseVersion);
        myScanner.checkWeakness();

        System.out.println("Main method ended successfully"); // Execution end log
    }
}