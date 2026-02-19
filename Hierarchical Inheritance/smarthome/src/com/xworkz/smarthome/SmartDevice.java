package com.xworkz.smarthome;

public class SmartDevice {
    // Parent attribute
    public String connectivity = "WiFi 6";

    // Parent method
    public void updateFirmware() {
        System.out.println("Invoking updateFirmware in SmartDevice"); // Mandatory SOP
        System.out.println(">> [SYSTEM] Downloading latest security patches via " + connectivity);
    }
}