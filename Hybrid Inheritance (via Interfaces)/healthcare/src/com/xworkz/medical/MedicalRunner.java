package com.xworkz.medical;

public class MedicalRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in MedicalRunner");

        RoboticSurgeon daVinci = new RoboticSurgeon();

        System.out.println("Project: Medical Robotics Hybrid Inheritance");
        System.out.println("------------------------------------------");

        // 1. From Grandparent (Multilevel)
        daVinci.calibrate();

        // 2. From Parent (Multilevel)
        daVinci.sterilize();

        // 3. From HumanOperated Interface (Multiple)
        daVinci.followSurgeonInput();

        // 4. From HighPrecision Interface (Multiple)
        daVinci.adjustMicroMovement();

        System.out.println("Main method ended successfully");
    }
}