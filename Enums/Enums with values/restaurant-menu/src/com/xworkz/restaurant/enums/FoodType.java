package com.xworkz.restaurant.enums;

// Enum representing types of food with a packaging charge value
public enum FoodType {
    VEG(20),
    NON_VEG(50),
    VEGAN(30),
    DESSERT(15);

    // Private field for extra packaging/service cost
    private final int packagingCharge;

    // Private constructor
    FoodType(int packagingCharge) {
        this.packagingCharge = packagingCharge;
    }

    // Getter
    public int getPackagingCharge() {
        return packagingCharge;
    }
}
