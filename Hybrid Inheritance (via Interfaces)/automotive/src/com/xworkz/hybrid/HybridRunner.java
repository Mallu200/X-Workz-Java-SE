package com.xworkz.hybrid;

public class HybridRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in HybridRunner");

        SmartEV myTesla = new SmartEV();

        System.out.println("Project: Hybrid Inheritance (Class + Interfaces)");
        System.out.println("----------------------------------------------");

        // 1. Level 1: Grandparent method
        myTesla.transport();

        // 2. Level 2: Parent method
        myTesla.steer();

        // 3. Interface 1: Electronic behavior
        myTesla.runSoftware();

        // 4. Interface 2: Solar behavior
        myTesla.chargeFromSun();

        System.out.println("Main method ended successfully");
    }
}