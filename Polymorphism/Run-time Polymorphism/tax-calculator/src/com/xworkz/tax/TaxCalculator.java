package com.xworkz.tax;

public class TaxCalculator {
    // Basic behavior: Every tax system takes an amount
    public void calculateTax(double amount) {
        System.out.println("Invoking calculateTax in TaxCalculator");
        double basicTax = amount * 0.05; // Default 5%
        System.out.println(">> Generic Tax: ₹" + basicTax);
    }
}
