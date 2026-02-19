package com.xworkz.medical;

// RoboticSurgeon 'Is-A' MedicalDevice (Multilevel)
// AND implements HumanOperated, HighPrecision (Multiple)
public class RoboticSurgeon extends MedicalDevice implements HumanOperated, HighPrecision {

    @Override
    public void followSurgeonInput() {
        System.out.println("Invoking followSurgeonInput in RoboticSurgeon"); // Mandatory SOP
        System.out.println(">> [INPUT] Translating hand gestures to mechanical motion.");
    }

    @Override
    public void adjustMicroMovement() {
        System.out.println("Invoking adjustMicroMovement in RoboticSurgeon"); // Mandatory SOP
        System.out.println(">> [PRECISION] Stabilizing tremor; adjustment set to 0.01mm.");
    }
}