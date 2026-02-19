package com.xworkz.smartwatch;

public class WatchRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in WatchRunner");

        // Object creation
        SmartWatch appleWatch = new SmartWatch();

        System.out.println("Project: SmartWatch Multiple Inheritance");
        System.out.println("----------------------------------------");

        // 1. Using Fitness features
        appleWatch.trackSteps();

        // 2. Using Messenger features
        appleWatch.showAlerts();

        System.out.println("Main method ended successfully");
    }
}