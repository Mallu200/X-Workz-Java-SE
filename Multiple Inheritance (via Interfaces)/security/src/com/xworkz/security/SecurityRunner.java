package com.xworkz.security;

public class SecurityRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in SecurityRunner");

        // Create the object of the class that implements interfaces
        SmartCamera nestCam = new SmartCamera();

        System.out.println("Project: Multiple Inheritance via Interfaces");
        System.out.println("-------------------------------------------");

        // 1. Calling behavior from SecuritySensor
        nestCam.detectMotion();

        // 2. Calling behavior from VideoRecorder
        nestCam.startRecording();

        System.out.println("Main method ended successfully");
    }
}