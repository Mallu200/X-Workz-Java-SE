package com.xworkz.bank;

public class RBIRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Industry standard: Use the Interface as the reference type
        RBIRules myBank;

        System.out.println("--- Testing SBI Implementation ---");
        myBank = new SBIBank();
        myBank.openAccount("Aadhar Card");
        myBank.checkKYCStatus();
        System.out.println("Minimum RBI Interest: " + RBIRules.MIN_INTEREST_RATE + "%");

        System.out.println("\n--- Testing HDFC Implementation ---");
        myBank = new HDFCBank();
        myBank.openAccount("Passport");
        myBank.processWithdrawal(10000.0);

        System.out.println("Main method ended.");
    }
}
