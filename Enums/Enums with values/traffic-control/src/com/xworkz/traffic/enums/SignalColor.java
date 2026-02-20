package com.xworkz.traffic.enums;

// Enum representing Traffic Signals with custom values for duration and instruction
public enum SignalColor {
    RED(60, "STOP"),
    YELLOW(10, "READY"),
    GREEN(45, "GO");

    // Private fields for custom data
    private final int duration;
    private final String action;

    // Private constructor to map values to constants
    SignalColor(int duration, String action) {
        this.duration = duration;
        this.action = action;
    }

    // Getters to access the values
    public int getDuration() { return duration; }
    public String getAction() { return action; }
}
