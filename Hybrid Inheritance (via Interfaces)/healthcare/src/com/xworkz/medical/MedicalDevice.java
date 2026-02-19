package com.xworkz.medical;

// Parent Class
public class MedicalDevice extends Machine {
    void sterilize() {
        System.out.println("Invoking sterilize in MedicalDevice");
        System.out.println(">> [SAFETY] Initiating UV-C sterilization cycle.");
    }
}
