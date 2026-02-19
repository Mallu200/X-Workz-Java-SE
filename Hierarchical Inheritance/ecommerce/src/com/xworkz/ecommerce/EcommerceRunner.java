package com.xworkz.ecommerce;

public class EcommerceRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in EcommerceRunner");

        System.out.println("--- Testing Electronics Branch ---");
        Electronics laptop = new Electronics();
        laptop.displayDetails(); // Inherited from Product
        laptop.checkWarranty();  // Specific to Electronics

        System.out.println("\n--- Testing Clothing Branch ---");
        Clothing tShirt = new Clothing();
        tShirt.displayDetails(); // Inherited from same Product parent
        tShirt.showSizeChart();  // Specific to Clothing

        System.out.println("\nDefault Product Base Price: " + laptop.price);
        System.out.println("Main method ended successfully");
    }
}