package com.xworkz.realestate;

import com.xworkz.realestate.dto.PropertyDTO;

public class RealEstateRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in RealEstateRunner");

        // Creating property 1 using All-args constructor
        PropertyDTO prop1 = new PropertyDTO("PROP-99", "Rajajinagar, Bengaluru", "Apartment", 1250.0, 8500000.0);

        // Creating property 2 using No-args and Setters
        PropertyDTO prop2 = new PropertyDTO();
        prop2.setPropertyId("PROP-100");
        prop2.setLocation("Indiranagar, Bengaluru");
        prop2.setType("Villa");
        prop2.setAreaInSqFt(3500.0);
        prop2.setPrice(45000000.0);

        System.out.println("\n--- Current Property Listings ---");
        System.out.println(prop1);
        System.out.println(prop2);

        // Testing Equality check
        PropertyDTO prop3 = new PropertyDTO("PROP-99", "Other Location", "Plot", 0.0, 0.0);
        System.out.println("\nIs prop1 same as prop3 (ID Check)? " + prop1.equals(prop3));

        System.out.println("Main method ended successfully");
    }
}