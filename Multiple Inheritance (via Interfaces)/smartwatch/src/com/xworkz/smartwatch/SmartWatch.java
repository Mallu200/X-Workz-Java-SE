package com.xworkz.smartwatch;

// SmartWatch 'Is-A' FitnessTracker AND 'Is-A' Messenger
public class SmartWatch implements FitnessTracker, Messenger {

    @Override
    public void trackSteps() {
        System.out.println("Invoking trackSteps in SmartWatch"); // Mandatory SOP
        System.out.println(">> [HEALTH] Pedometer active: 5,432 steps recorded today.");
    }

    @Override
    public void showAlerts() {
        System.out.println("Invoking showAlerts in SmartWatch"); // Mandatory SOP
        System.out.println(">> [MESSAGE] New notification: 'Time for your workout!'");
    }
}