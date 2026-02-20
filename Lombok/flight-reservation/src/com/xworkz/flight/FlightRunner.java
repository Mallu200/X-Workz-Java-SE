package com.xworkz.flight;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.enums.FlightStatus;

public class FlightRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Using Builder to create a complex Flight object
        FlightDTO flight = FlightDTO.builder()
                .flightNumber("AI-304")
                .airline("Air India")
                .source("Bengaluru")
                .destination("London")
                .ticketPrice(75000.50)
                .status(FlightStatus.ON_TIME)
                .build();

        // Accessing data using Lombok Getters
        System.out.println("Invoking getFlightNumber: " + flight.getFlightNumber());
        System.out.println("Route: " + flight.getSource() + " to " + flight.getDestination());

        // Printing object state via @Data's toString
        System.out.println("Initial Flight Info: " + flight.toString());

        //  Updating status using Setter
        flight.setStatus(FlightStatus.DELAYED);
        System.out.println("Updated Status: " + flight.getStatus());

        // Checking Equality with another flight object
        FlightDTO anotherFlight = FlightDTO.builder().flightNumber("AI-304").build();
        System.out.println("Is it the same flight ID? " + flight.getFlightNumber().equals(anotherFlight.getFlightNumber()));

        System.out.println("Main method ended.");
    }
}