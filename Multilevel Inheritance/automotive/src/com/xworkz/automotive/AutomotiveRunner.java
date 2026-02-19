package com.xworkz.automotive;

public class AutomotiveRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in AutomotiveRunner"); // Execution start log

        // Instantiate the bottom-level child class
        ElectricCar myTesla = new ElectricCar();

        System.out.println("Project: Automotive Multilevel Inheritance");
        System.out.println("------------------------------------------");

        // 1. Calling Grandparent behavior
        myTesla.move();

        // 2. Calling Parent behavior
        myTesla.steer();

        // 3. Calling Child behavior
        myTesla.chargeBattery();

        // 4. Accessing attributes from different levels
        System.out.println("Primary Energy: " + myTesla.fuelType); // From Grandparent
        System.out.println("Current Battery: " + myTesla.batteryPercentage + "%"); // From Child

        System.out.println("Main method ended successfully"); // Execution end log
    }
}