package com.xworkz.hybrid;

// SmartEV 'Is-A' Car (Multilevel) AND 'Is-An' Electronic AND 'Is-A' SolarPowered (Multiple)
public class SmartEV extends Car implements Electronic, SolarPowered {

    @Override
    public void runSoftware() {
        System.out.println("Invoking runSoftware in SmartEV"); // Mandatory SOP
        System.out.println(">> [AI] OS is booting... Autopilot ready.");
    }

    @Override
    public void chargeFromSun() {
        System.out.println("Invoking chargeFromSun in SmartEV"); // Mandatory SOP
        System.out.println(">> [ENERGY] Solar roof panels are generating power.");
    }
}