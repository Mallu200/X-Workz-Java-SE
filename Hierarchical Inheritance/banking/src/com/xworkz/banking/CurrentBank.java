package com.xworkz.banking;

// CurrentBank 'Is-A' Bank
public class CurrentBank extends Bank {

    public void overDraftLimit() {
        System.out.println("Invoking overDraftLimit in CurrentBank"); // Mandatory SOP
        System.out.println(">> [BUSINESS] Business overdraft limit set to 5,00,000.");
    }
}