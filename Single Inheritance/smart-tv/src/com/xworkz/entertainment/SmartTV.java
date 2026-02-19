package com.xworkz.entertainment;

// Using 'extends' to inherit basic TV features into the Smart version
public class SmartTV extends Television {

    // Unique method: Standard TVs cannot connect to WiFi
    public void connectToWiFi() {
        System.out.println("Invoking connectToWiFi in SmartTV"); // Method entry log
        System.out.println(">> [NETWORK] Connecting to Home_WiFi_5G...");
    }

    // Unique method: Specialized app functionality
    public void streamNetflix() {
        System.out.println("Invoking streamNetflix in SmartTV"); // Method entry log
        System.out.println(">> [APPS] Loading Netflix... Enjoy your movie!");
    }
}