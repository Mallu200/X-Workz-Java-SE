package com.xworkz.construction;

// Apartment 'Is-A' Residential (Level 2 Inheritance)
public class Apartment extends Residential {

    // Child attribute
    public int floorNumber = 12;

    // Child method
    public void balconyView() {
        System.out.println("Invoking balconyView in Apartment"); // Mandatory SOP
        System.out.println(">> [VIEW] Overlooking the city skyline from floor " + floorNumber + ".");
    }
}