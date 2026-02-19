package com.xworkz.travel;

import com.xworkz.travel.dto.FlightDTO;

public class TravelRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in TravelRunner");

        // Object 1: Using All-args constructor
        FlightDTO flight1 = new FlightDTO("6E-234", "IndiGo", "Bengaluru", "Mumbai", 5500.0);

        // Object 2: Using No-args and Setters
        FlightDTO flight2 = new FlightDTO();
        flight2.setFlightNumber("AI-101");
        flight2.setAirlineName("Air India");
        flight2.setSource("Delhi");
        flight2.setDestination("London");
        flight2.setTicketPrice(75000.0);

        // Printing results
        System.out.println("\n--- Flight Bookings ---");
        System.out.println(flight1);
        System.out.println(flight2);

        // Testing Equality
        FlightDTO flight3 = new FlightDTO("6E-234", "IndiGo", "Chennai", "Kochi", 3000.0);
        System.out.println("\nIs Flight 1 same as Flight 3? " + flight1.equals(flight3));

        System.out.println("Main method ended successfully");
    }
}