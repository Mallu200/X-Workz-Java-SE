package com.xworkz.fintech;

// Parent Class
public class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Invoking calculateInterest in SavingsAccount");
        System.out.println(">> [SAVINGS] Interest rate set at 4.5% per annum.");
    }
}
