package com.xworkz.smarthome;

public class HomeRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in HomeRunner");

        System.out.println("--- Testing Smart Light Branch ---");
        SmartLight livingRoomLight = new SmartLight();
        livingRoomLight.updateFirmware(); // Inherited from SmartDevice
        livingRoomLight.setBrightness(75); // Specific to SmartLight

        System.out.println("\n--- Testing Smart Camera Branch ---");
        SmartCamera frontDoorCam = new SmartCamera();
        frontDoorCam.updateFirmware();    // Inherited from same Parent
        frontDoorCam.startRecording();    // Specific to SmartCamera

        System.out.println("\nNetwork Protocol used by all: " + frontDoorCam.connectivity);
        System.out.println("Main method ended successfully");
    }
}