package com.xworkz.appliance;

public abstract class SmartDevice {
    private String brand;

    public SmartDevice(String brand) {
        this.brand = brand;
    }

    // Concrete method: Every device shows its brand info the same way
    public void showBrand() {
        System.out.println("Device Brand: " + brand);
    }

    // Abstract methods: The "How" depends on the device type
    public abstract void pressPowerButton();
    public abstract void adjustSettings();
}
