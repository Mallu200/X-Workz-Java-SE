package com.xworkz.restaurant;

import com.xworkz.restaurant.dto.FoodItemDTO;
import com.xworkz.restaurant.enums.FoodType;

public class RestaurantRunner {

    public static void main(String[] args) {
        // Mandatory Start SOP
        System.out.println("Main method started...");

        // Creating a Food Item DTO
        FoodItemDTO order = new FoodItemDTO("Chicken Biryani", 350.0, FoodType.NON_VEG);

        // Accessing data using Getters
        System.out.println("Invoking getItemName: " + order.getItemName());
        System.out.println("Invoking getPrice: " + order.getPrice());
        System.out.println("Invoking getType: " + order.getType());

        // Single line comment: Calculating total bill including packaging charge from Enum
        int charge = order.getType().getPackagingCharge();
        double finalBill = order.getPrice() + charge;

        System.out.println("Base Price: " + order.getPrice());
        System.out.println("Packaging Charge for " + order.getType() + ": " + charge);
        System.out.println("Total Amount to Pay: " + finalBill);

        // Printing full DTO state
        System.out.println("Full Order Summary: " + order.toString());

        // Mandatory End SOP
        System.out.println("Main method ended.");
    }
}