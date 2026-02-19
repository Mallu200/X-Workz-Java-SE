package com.xworkz.smarthome;

public class SmartHomeRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in SmartHomeRunner");

        VoiceControlledLight hallLight = new VoiceControlledLight();

        System.out.println("Project: Smart Home Hybrid Inheritance");
        System.out.println("-------------------------------------");

        // 1. From Grandparent (Multilevel)
        hallLight.powerOn();

        // 2. From Parent (Multilevel)
        hallLight.setBrightness();

        // 3. From WiFiConnected Interface (Multiple)
        hallLight.connectToRouter();

        // 4. From VoiceResponsive Interface (Multiple)
        hallLight.processCommand("Turn off in 10 minutes");

        System.out.println("Main method ended successfully");
    }
}