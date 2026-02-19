package com.xworkz.telecom;

// BasicPhone 'Is-A' ElectronicDevice (Inheritance Level 1)
public class BasicPhone extends ElectronicDevice {

    // Parent method
    public void makeCall() {
        System.out.println("Invoking makeCall in BasicPhone"); // Mandatory SOP
        System.out.println(">> [PHONE] Connection established for voice call.");
    }
}