package com.xworkz.ecommerce;

// Clothing 'Is-A' Product
public class Clothing extends Product {

    public void showSizeChart() {
        System.out.println("Invoking showSizeChart in Clothing"); // Mandatory SOP
        System.out.println(">> [APPAREL] Displaying S, M, L, and XL dimensions.");
    }
}