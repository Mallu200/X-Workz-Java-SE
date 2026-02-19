package com.xworkz.factory;

public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName);
    }

    @Override
    public void assembleEngine() {
        System.out.println("Invoking assembleEngine in Car");
        System.out.println(">> [CAR] Fitting a compact 4-cylinder petrol engine.");
    }

    @Override
    public void applyPaint() {
        System.out.println(">> [CAR] Applying high-gloss metallic finish.");
    }
}