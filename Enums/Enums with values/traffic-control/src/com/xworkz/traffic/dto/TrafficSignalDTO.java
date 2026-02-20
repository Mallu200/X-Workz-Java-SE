package com.xworkz.traffic.dto;

import com.xworkz.traffic.enums.SignalColor;

import java.util.Objects;

public class TrafficSignalDTO {
    private String signalLocation;
    private SignalColor activeColor; // Using the advanced Enum

    // Default Constructor
    public TrafficSignalDTO() {}

    // Parameterized Constructor
    public TrafficSignalDTO(String signalLocation, SignalColor activeColor) {
        this.signalLocation = signalLocation;
        this.activeColor = activeColor;
    }

    // Getters and Setters
    public String getSignalLocation() { return signalLocation; }
    public void setSignalLocation(String signalLocation) { this.signalLocation = signalLocation; }

    public SignalColor getActiveColor() { return activeColor; }
    public void setActiveColor(SignalColor activeColor) { this.activeColor = activeColor; }

    // Object Methods
    @Override
    public String toString() {
        return "TrafficSignalDTO [location=" + signalLocation + ", color=" + activeColor + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrafficSignalDTO that = (TrafficSignalDTO) o;
        return Objects.equals(signalLocation, that.signalLocation) && activeColor == that.activeColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(signalLocation, activeColor);
    }
}
