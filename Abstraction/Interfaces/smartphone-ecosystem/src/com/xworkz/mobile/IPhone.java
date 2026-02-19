package com.xworkz.mobile;

public class IPhone implements SmartPhone {

    @Override
    public void makeCall(long number) {
        System.out.println("Invoking makeCall in IPhone");
        System.out.println(">> [APPLE] Connecting call " + number + " via FaceTime Audio.");
    }

    @Override
    public void takePhoto() {
        System.out.println(">> [APPLE] Processing Deep Fusion image with Computational Photography.");
    }

    @Override
    public void browseInternet() {
        System.out.println(">> [APPLE] Browsing securely via Safari.");
    }
}