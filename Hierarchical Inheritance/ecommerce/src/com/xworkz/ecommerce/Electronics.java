package com.xworkz.ecommerce;

// Electronics 'Is-A' Product
public class Electronics extends Product {


    public void checkWarranty() {
        System.out.println("Invoking checkWarranty in Electronics"); // Mandatory SOP
        System.out.println(">> [TECH] Validating 1-year manufacturer warranty...");
    }
}