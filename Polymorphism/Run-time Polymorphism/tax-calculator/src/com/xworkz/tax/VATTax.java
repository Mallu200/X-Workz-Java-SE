package com.xworkz.tax;

public class VATTax extends TaxCalculator {

    @Override
    public void calculateTax(double amount) {
        System.out.println("Invoking calculateTax in VATTax");
        // VAT logic: 20% standard
        double vatAmount = amount * 0.20;
        System.out.println(">> Applied VAT (20%): ₹" + vatAmount);
    }
}
