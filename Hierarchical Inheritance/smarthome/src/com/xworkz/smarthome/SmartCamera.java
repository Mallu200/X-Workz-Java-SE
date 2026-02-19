package com.xworkz.smarthome;

// SmartCamera 'Is-A' SmartDevice
public class SmartCamera extends SmartDevice {

    public void startRecording() {
        System.out.println("Invoking startRecording in SmartCamera"); // Mandatory SOP
        System.out.println(">> [SECURITY] Motion detected. Saving footage to cloud storage.");
    }
}