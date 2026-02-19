package com.xworkz.banking;

public class Bank {
    // Parent attribute
    public String bankName = "RBI Standard Bank";

    // Parent method
    public void deposit() {
        System.out.println("Invoking deposit in Bank"); // Mandatory SOP
        System.out.println(">> [BANK] Money has been securely added to the vault.");
    }
}