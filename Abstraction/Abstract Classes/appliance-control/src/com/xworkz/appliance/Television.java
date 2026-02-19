package com.xworkz.appliance;

public class Television extends SmartDevice {

    public Television(String brand) {
        super(brand);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Invoking pressPowerButton in Television");
        System.out.println(">> [TV] Displaying logo... Loading Home Screen.");
    }

    @Override
    public void adjustSettings() {
        System.out.println(">> [TV] Changing Volume level and HDMI Input.");
    }
}
