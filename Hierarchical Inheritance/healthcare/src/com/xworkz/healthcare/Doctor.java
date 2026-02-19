package com.xworkz.healthcare;

public class Doctor {
    // Parent attribute
    public String qualification = "MBBS";

    // Parent method
    public void checkVitals() {
        System.out.println("Invoking checkVitals in Doctor"); // Mandatory SOP
        System.out.println(">> [DOCTOR] Checking blood pressure and heart rate...");
    }
}