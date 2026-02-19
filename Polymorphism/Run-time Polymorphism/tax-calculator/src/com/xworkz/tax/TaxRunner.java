package com.xworkz.tax;

public class TaxRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Parent Reference
        TaxCalculator calculator;

        // At Runtime, we decide to use Indian GST
        calculator = new GSTTax();
        calculator.calculateTax(1000.0);

        System.out.println("---------------------------");

        // At Runtime, we switch to European VAT
        calculator = new VATTax();
        calculator.calculateTax(1000.0);

        System.out.println("Main method ended.");
    }
}