package com.xworkz.flight.dto;

import com.xworkz.flight.enums.FlightStatus;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data                // Getters, Setters, toString, Equals, HashCode
@Builder             // Clean object creation
@NoArgsConstructor   // Mandatory for certain frameworks
@AllArgsConstructor  // Required by Builder
public class FlightDTO {
    private String flightNumber;
    private String airline;
    private String source;
    private String destination;
    private double ticketPrice;
    private FlightStatus status;
}