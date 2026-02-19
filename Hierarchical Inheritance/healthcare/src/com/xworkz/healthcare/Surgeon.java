package com.xworkz.healthcare;

// Surgeon 'Is-A' Doctor
public class Surgeon extends Doctor {

    public void performSurgery() {
        System.out.println("Invoking performSurgery in Surgeon"); // Mandatory SOP
        System.out.println(">> [SURGERY] Commencing specialized operation in OT.");
    }
}