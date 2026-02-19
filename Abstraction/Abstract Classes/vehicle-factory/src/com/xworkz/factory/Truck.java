package com.xworkz.factory;

public class Truck extends Vehicle {

    public Truck(String modelName) {
        super(modelName);
    }

    @Override
    public void assembleEngine() {
        System.out.println("Invoking assembleEngine in Truck");
        System.out.println(">> [TRUCK] Installing heavy-duty V8 diesel engine with turbo.");
    }

    @Override
    public void applyPaint() {
        System.out.println(">> [TRUCK] Applying anti-corrosive matte industrial coating.");
    }
}
