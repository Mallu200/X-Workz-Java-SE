package com.xworkz.transport;

import java.util.Vector;

public class TransportRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Parent reference
        Vehicle myVehicle;

        // Pointing to a Train object
        myVehicle = new Train();
        myVehicle.startEngine(); // Calls Parent's version (not overridden)
        myVehicle.move();        // Calls Train's version (Overridden)

        System.out.println("---------------------------");

        // Pointing to a Flight object
        myVehicle = new Flight();
        myVehicle.startEngine(); // Calls Flight's version (Overridden)
        myVehicle.move();        // Calls Flight's version (Overridden)

        System.out.println("Main method ended.");
    }
}
