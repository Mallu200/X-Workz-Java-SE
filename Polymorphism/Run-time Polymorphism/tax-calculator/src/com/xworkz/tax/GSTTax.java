package com.xworkz.tax;

public class GSTTax extends TaxCalculator {

    @Override
    public void calculateTax(double amount) {
        System.out.println("Invoking calculateTax in GSTTax");
        // GST logic: 18% standard
        double gstAmount = amount * 0.18;
        System.out.println(">> Applied GST (18%): ₹" + gstAmount);
    }
}