package com.xworkz.hybrid;

// HybridCar 'Is-A' FuelEngine AND 'Is-A' ElectricMotor
public class HybridCar implements FuelEngine, ElectricMotor {

    @Override
    public void fillFuel() {
        System.out.println("Invoking fillFuel in HybridCar"); // Mandatory SOP
        System.out.println(">> [GAS] Tank filled with Octane 95. Ready for long-range.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Invoking chargeBattery in HybridCar"); // Mandatory SOP
        System.out.println(">> [EV] Battery charged to 100% via regenerative braking.");
    }
}