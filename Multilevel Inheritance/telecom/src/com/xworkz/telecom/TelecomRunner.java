package com.xworkz.telecom;

public class TelecomRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in TelecomRunner"); // Start log

        // Create the object of the MOST specific class (Child)
        SmartPhone myPhone = new SmartPhone();

        System.out.println("Project: Telecom Multilevel Inheritance");
        System.out.println("---------------------------------------");

        // 1. Calling method from Grandparent
        myPhone.consumeEnergy();

        // 2. Calling method from Parent
        myPhone.makeCall();

        // 3. Calling method from Child
        myPhone.browseInternet();

        // 4. Accessing attribute from Grandparent
        System.out.println("Is Device Powered: " + myPhone.isPowered);

        System.out.println("Main method ended successfully"); // End log
    }
}