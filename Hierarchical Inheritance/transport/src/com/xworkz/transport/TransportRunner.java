package com.xworkz.transport;

public class TransportRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in TransportRunner");

        System.out.println("--- Testing Public Transport (Bus/Metro) ---");
        PublicTransport cityBus = new PublicTransport();
        cityBus.startEngine();  // Inherited from Vehicle
        cityBus.issueTicket();   // Specific to PublicTransport

        System.out.println("\n--- Testing Private Transport (Personal Car) ---");
        PrivateTransport myCar = new PrivateTransport();
        myCar.startEngine();    // Inherited from same Vehicle parent
        myCar.lockSmartDoors(); // Specific to PrivateTransport

        System.out.println("\nFinal Engine Status: " + myCar.engineStatus);
        System.out.println("Main method ended successfully");
    }
}