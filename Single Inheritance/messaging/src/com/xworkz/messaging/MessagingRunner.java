package com.xworkz.messaging;

public class MessagingRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in MessagingRunner"); // Logging start of execution

        // Instantiating the Child class to gain access to Parent members
        WhatsApp myChat = new WhatsApp();

        System.out.println("Testing Single Inheritance for Project: Messaging");
        System.out.println("------------------------------------------------");

        // 1. Calling the inherited method from MessagingApp
        myChat.sendMessage();

        // 2. Calling specific behaviors defined only in WhatsApp
        myChat.sendVoiceNote();
        myChat.videoCall();

        // 3. Accessing the field inherited from the Parent class
        System.out.println("Accessing appName attribute: " + myChat.appName);

        System.out.println("Main method ended successfully"); // Logging end of execution
    }
}