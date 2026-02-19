package com.xworkz.transport;

// PrivateTransport 'Is-A' Vehicle
public class PrivateTransport extends Vehicle {

    public void lockSmartDoors() {
        System.out.println("Invoking lockSmartDoors in PrivateTransport"); // Mandatory SOP
        System.out.println(">> [PRIVATE] Biometric lock engaged. Doors secured.");
    }
}