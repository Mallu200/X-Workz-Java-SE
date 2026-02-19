package com.xworkz.factory;

public class FactoryRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Manufacturing a Car
        Vehicle myCar = new Car("Swift");
        myCar.assembleEngine();
        myCar.applyPaint();
        myCar.performSafetyCheck();

        System.out.println("---------------------------");

        // Manufacturing a Truck
        Vehicle myTruck = new Truck("BharatBenz");
        myTruck.assembleEngine();
        myTruck.applyPaint();
        myTruck.performSafetyCheck();

        System.out.println("Main method ended.");
    }
}
