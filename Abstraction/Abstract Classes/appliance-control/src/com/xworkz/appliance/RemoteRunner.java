package com.xworkz.appliance;

public class RemoteRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Using Parent Reference for a TV
        SmartDevice myDevice = new Television("Sony");
        myDevice.showBrand();
        myDevice.pressPowerButton();
        myDevice.adjustSettings();

        System.out.println("---------------------------");

        // Re-using the same Parent Reference for an AC
        myDevice = new AirConditioner("Daikin");
        myDevice.showBrand();
        myDevice.pressPowerButton();
        myDevice.adjustSettings();

        System.out.println("Main method ended.");
    }
}
