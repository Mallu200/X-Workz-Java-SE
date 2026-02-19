package com.xworkz.banking;

// SavingsBank 'Is-A' Bank
public class SavingsBank extends Bank {

    public void addInterest() {
        System.out.println("Invoking addInterest in SavingsBank"); // Mandatory SOP
        System.out.println(">> [SAVINGS] Monthly interest of 4% credited to account.");
    }
}