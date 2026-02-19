package com.xworkz.appliance;

public class AirConditioner extends SmartDevice {

    public AirConditioner(String brand) {
        super(brand);
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Invoking pressPowerButton in AirConditioner");
        System.out.println(">> [AC] Opening vents... Starting Compressor.");
    }

    @Override
    public void adjustSettings() {
        System.out.println(">> [AC] Adjusting Temperature to 24°C and Fan Speed to High.");
    }
}
