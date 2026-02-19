package com.xworkz.healthcare;

// Dentist 'Is-A' Doctor
public class Dentist extends Doctor {

    public void dentalFilling() {
        System.out.println("Invoking dentalFilling in Dentist"); // Mandatory SOP
        System.out.println(">> [DENTAL] Performing cavity restoration and cleaning.");
    }
}