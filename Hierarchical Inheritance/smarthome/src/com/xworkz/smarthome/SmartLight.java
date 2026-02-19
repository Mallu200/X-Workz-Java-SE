package com.xworkz.smarthome;

// SmartLight 'Is-A' SmartDevice
public class SmartLight extends SmartDevice {

    public void setBrightness(int level) {
        System.out.println("Invoking setBrightness in SmartLight with level: " + level); // Mandatory SOP
        System.out.println(">> [LIGHT] Adjusting intensity to " + level + "%.");
    }
}