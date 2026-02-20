package com.xworkz.delivery.enums;

public enum Status {
    // These constants now pass values to the constructor below
    ORDERED(1),
    PACKED(2),
    SHIPPED(5),
    DELIVERED(0);

    // Private field to hold the specific value
    private final int daysToWait;

    // Private Constructor (Enums cannot be instantiated with 'new')
    Status(int daysToWait) {
        this.daysToWait = daysToWait;
    }

    // Getter to access the specific value
    public int getDaysToWait() {
        return daysToWait;
    }
}