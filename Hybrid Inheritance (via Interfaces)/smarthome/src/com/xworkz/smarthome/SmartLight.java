package com.xworkz.smarthome;

// Parent Class
public class SmartLight extends Appliance {
    void setBrightness() {
        System.out.println("Invoking setBrightness in SmartLight");
        System.out.println(">> [LIGHT] Dimming LEDs to 50% intensity.");
    }
}
