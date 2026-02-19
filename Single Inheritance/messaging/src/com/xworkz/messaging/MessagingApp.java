package com.xworkz.messaging;

public class MessagingApp {
    // Parent attribute: Stores the general name of the application
    public String appName = "Generic Messenger";

    // Parent method: Logic that every messaging app shares
    public void sendMessage() {
        System.out.println("Invoking sendMessage in MessagingApp"); // Mandatory SOP for flow tracking
        System.out.println(">> [SYSTEM] Sending a plain text message...");
    }
}