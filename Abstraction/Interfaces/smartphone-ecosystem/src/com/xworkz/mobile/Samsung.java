package com.xworkz.mobile;

public class Samsung implements SmartPhone {

    @Override
    public void makeCall(long number) {
        System.out.println("Invoking makeCall in Samsung");
        System.out.println(">> [SAMSUNG] Dialing " + number + " using Galaxy Dialer.");
    }

    @Override
    public void takePhoto() {
        System.out.println(">> [SAMSUNG] Capturing photo with 108MP Zoom lens.");
    }

    @Override
    public void browseInternet() {
        System.out.println(">> [SAMSUNG] Opening web pages via Samsung Internet Browser.");
    }
}