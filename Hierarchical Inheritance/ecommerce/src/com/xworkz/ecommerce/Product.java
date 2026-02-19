package com.xworkz.ecommerce;

public class Product {
    // Parent attribute
    public double price = 999.0;

    // Parent method
    public void displayDetails() {
        System.out.println("Invoking displayDetails in Product"); // Mandatory SOP
        System.out.println(">> [PRODUCT] Showing standard specifications and shipping info.");
    }
}