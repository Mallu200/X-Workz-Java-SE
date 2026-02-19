package com.xworkz.hybrid;

public class HybridRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in HybridRunner");

        // Object of the HybridCar
        HybridCar myPrius = new HybridCar();

        System.out.println("Project: Hybrid Car Multiple Inheritance");
        System.out.println("----------------------------------------");

        // 1. Using FuelEngine behavior
        myPrius.fillFuel();

        // 2. Using ElectricMotor behavior
        myPrius.chargeBattery();

        System.out.println("Main method ended successfully");
    }
}