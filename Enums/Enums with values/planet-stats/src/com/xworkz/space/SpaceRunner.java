package com.xworkz.space;

import com.xworkz.space.dto.PlanetDTO;
import com.xworkz.space.enums.Planet;

public class SpaceRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating the DTO
        PlanetDTO myPlanet = new PlanetDTO("Galileo", Planet.EARTH);

        // Accessing basic data
        System.out.println("Invoking getDiscoverer: " + myPlanet.getDiscoverer());
        System.out.println("Invoking getPlanetType: " + myPlanet.getPlanetType());

        //  Accessing specific scientific values from the Enum
        double mass = myPlanet.getPlanetType().getMass();
        double radius = myPlanet.getPlanetType().getRadius();

        System.out.println("Planet Mass: " + mass + " kg");
        System.out.println("Planet Radius: " + radius + " meters");

        // Using Enum values for a gravity calculation
        // Formula: g = G * M / R^2
        final double G = 6.67300E-11;
        double gravity = G * mass / (radius * radius);

        System.out.println("Surface Gravity on " + myPlanet.getPlanetType() + ": " + gravity + " m/s²");

        System.out.println("Main method ended.");
    }
}