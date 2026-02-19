package com.xworkz.entertainment;

public class TVRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in TVRunner"); // Execution start log

        // Creating object of SmartTV to demonstrate access to both Parent and Child members
        SmartTV myBravia = new SmartTV();

        System.out.println("Project: Smart TV Inheritance Testing");
        System.out.println("-------------------------------------");

        // 1. Using methods inherited from the Parent class (Television)
        myBravia.turnOn();
        myBravia.changeVolume(25);

        // 2. Using methods defined specifically in the Child class (SmartTV)
        myBravia.connectToWiFi();
        myBravia.streamNetflix();

        // 3. Accessing Parent attribute through the Child object
        System.out.println("Accessing brand attribute: " + myBravia.brand);

        System.out.println("Main method ended successfully"); // Execution end log
    }
}