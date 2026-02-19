package com.xworkz.travel.dto;

import java.util.Objects;

public class FlightDTO {
    // 1. Private Properties
    private String flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private double ticketPrice;

    // 2. No-Argument Constructor
    public FlightDTO() {
        System.out.println("Invoking No-arg constructor in FlightDTO");
    }

    // 3. All-Argument Constructor
    public FlightDTO(String flightNumber, String airlineName, String source, String destination, double ticketPrice) {
        System.out.println("Invoking All-arg constructor in FlightDTO");
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    // 4. Getters and Setters
    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public double getTicketPrice() { return ticketPrice; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

    // 5. Overriding toString() for readable output
    @Override
    public String toString() {
        return "FlightDTO [Flight#=" + flightNumber + ", Airline=" + airlineName +
                ", From=" + source + ", To=" + destination + ", Price=" + ticketPrice + "]";
    }

    // 6. Overriding hashCode and equals (based on flightNumber and Airline)
    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, airlineName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FlightDTO other = (FlightDTO) obj;
        return Objects.equals(flightNumber, other.flightNumber) &&
                Objects.equals(airlineName, other.airlineName);
    }
}