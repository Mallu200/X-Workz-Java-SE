package com.xworkz.telecom;

// SmartPhone 'Is-A' BasicPhone (Inheritance Level 2)
public class SmartPhone extends BasicPhone {

    // Child method
    public void browseInternet() {
        System.out.println("Invoking browseInternet in SmartPhone"); // Mandatory SOP
        System.out.println(">> [WEB] Opening browser and loading pages...");
    }
}