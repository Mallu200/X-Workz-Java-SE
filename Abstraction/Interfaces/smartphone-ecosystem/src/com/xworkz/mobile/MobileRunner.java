package com.xworkz.mobile;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Interface reference pointing to Samsung
        SmartPhone myPhone = new Samsung();
        myPhone.makeCall(9876543210L);
        myPhone.takePhoto();

        System.out.println("---------------------------");

        // Interface reference pointing to IPhone
        myPhone = new IPhone();
        myPhone.makeCall(1122334455L);
        myPhone.takePhoto();

        System.out.println("Main method ended.");
    }
}