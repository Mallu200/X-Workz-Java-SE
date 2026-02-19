package com.xworkz.healthcare;

public class HealthRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in HealthRunner");

        System.out.println("--- Testing Surgeon Specialist ---");
        Surgeon ortho = new Surgeon();
        ortho.checkVitals();    // Inherited from Doctor
        ortho.performSurgery();  // Specific to Surgeon

        System.out.println("\n--- Testing Dentist Specialist ---");
        Dentist d1 = new Dentist();
        d1.checkVitals();     // Inherited from same Doctor parent
        d1.dentalFilling();   // Specific to Dentist

        System.out.println("\nCommon Qualification: " + ortho.qualification);
        System.out.println("Main method ended successfully");
    }
}