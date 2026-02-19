package com.xworkz.entertainment;

public class Television {
    // Parent attribute: Shared by all types of TVs
    public String brand = "Sony";

    // Parent method: Basic functionality available in all TVs
    public void turnOn() {
        System.out.println("Invoking turnOn in Television"); // Mandatory SOP for tracking
        System.out.println(">> [POWER] Television is now ON.");
    }

    // Parent method: Parameterized method inherited by Child
    public void changeVolume(int level) {
        System.out.println("Invoking changeVolume in Television with level: " + level); // Tracking input
        System.out.println(">> [AUDIO] Volume adjusted to: " + level);
    }
}