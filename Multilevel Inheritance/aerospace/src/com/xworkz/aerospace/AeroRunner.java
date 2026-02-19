package com.xworkz.aerospace;

public class AeroRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in AeroRunner"); // Execution start log

        // Instantiate the specific Child class
        Boeing747 myJet = new Boeing747();

        System.out.println("Project: Aerospace Multilevel Inheritance");
        System.out.println("----------------------------------------");

        // 1. Accessing Grandparent behavior
        myJet.fly();

        // 2. Accessing Parent behavior
        myJet.cabinPressure();

        // 3. Accessing Child behavior
        myJet.autoPilot();

        // 4. Accessing attributes across levels
        System.out.println("Operating Medium: " + myJet.medium); // From Grandparent
        System.out.println("Total Passenger Seats: " + myJet.seatingCapacity); // From Child

        System.out.println("Main method ended successfully"); // Execution end log
    }
}