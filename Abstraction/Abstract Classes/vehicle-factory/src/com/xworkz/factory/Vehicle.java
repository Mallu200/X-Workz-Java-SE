package com.xworkz.factory;

public abstract class Vehicle {
    private String modelName;

    public Vehicle(String modelName) {
        this.modelName = modelName;
    }

    // Concrete method: All vehicles undergo the same safety inspection
    public final void performSafetyCheck() {
        System.out.println("Invoking performSafetyCheck for: " + modelName);
        System.out.println(">> [FACTORY] Brakes, lights, and sensors verified.");
    }

    // Abstract methods: Assembly details vary by vehicle size/type
    public abstract void assembleEngine();
    public abstract void applyPaint();
}