package com.xworkz.security;

// SmartCamera 'Is-A' SecuritySensor AND 'Is-A' VideoRecorder
public class SmartCamera implements SecuritySensor, VideoRecorder {

    @Override
    public void detectMotion() {
        System.out.println("Invoking detectMotion in SmartCamera"); // Mandatory SOP
        System.out.println(">> [SENSOR] Infrared beams triggered! Motion detected.");
    }

    @Override
    public void startRecording() {
        System.out.println("Invoking startRecording in SmartCamera"); // Mandatory SOP
        System.out.println(">> [VIDEO] Capturing 4K footage to the Cloud...");
    }
}