package com.xworkz.smarthome;

// VoiceControlledLight 'Is-A' SmartLight (Multilevel)
// AND implements WiFiConnected, VoiceResponsive (Multiple)
public class VoiceControlledLight extends SmartLight implements WiFiConnected, VoiceResponsive {

    @Override
    public void connectToRouter() {
        System.out.println("Invoking connectToRouter in VoiceControlledLight"); // Mandatory SOP
        System.out.println(">> [NETWORK] Syncing with Home_WiFi_5G...");
    }

    @Override
    public void processCommand(String command) {
        System.out.println("Invoking processCommand in VoiceControlledLight with: " + command); // Mandatory SOP
        System.out.println(">> [AI] Voice recognized. Executing: " + command);
    }
}