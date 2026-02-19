package com.xworkz.finance;

// Account 'Is-A' BankSystem (Level 1 Inheritance)
public class Account extends BankSystem {

    // Parent method
    public void checkBalance() {
        System.out.println("Invoking checkBalance in Account"); // Mandatory SOP
        System.out.println(">> [CORE] Fetching current available funds from database.");
    }
}