package com.xworkz.space.dto;

import com.xworkz.space.enums.Planet;

import java.util.Objects;

public class PlanetDTO {
    private String discoverer;
    private Planet planetType; // Using the Enum

    public PlanetDTO() {}

    public PlanetDTO(String discoverer, Planet planetType) {
        this.discoverer = discoverer;
        this.planetType = planetType;
    }

    // Standard Getters and Setters
    public String getDiscoverer() { return discoverer; }
    public void setDiscoverer(String discoverer) { this.discoverer = discoverer; }

    public Planet getPlanetType() { return planetType; }
    public void setPlanetType(Planet planetType) { this.planetType = planetType; }

    @Override
    public String toString() {
        return "PlanetDTO [discoverer=" + discoverer + ", planetType=" + planetType + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanetDTO planetDTO = (PlanetDTO) o;
        return Objects.equals(discoverer, planetDTO.discoverer) && planetType == planetDTO.planetType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discoverer, planetType);
    }
}