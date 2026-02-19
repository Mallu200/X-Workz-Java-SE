package com.xworkz.finance;

// FixedDeposit 'Is-A' Account (Level 2 Inheritance)
public class FixedDeposit extends Account {

    // Child attribute
    public double interestRate = 7.5;

    // Child method
    public void calculateMaturity() {
        System.out.println("Invoking calculateMaturity in FixedDeposit"); // Mandatory SOP
        System.out.println(">> [FD] Calculating returns at " + interestRate + "% interest rate.");
    }
}