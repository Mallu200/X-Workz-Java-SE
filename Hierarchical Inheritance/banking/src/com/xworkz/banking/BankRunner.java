package com.xworkz.banking;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in BankRunner");

        System.out.println("--- Testing Savings Bank Child ---");
        SavingsBank personalAccount = new SavingsBank();
        personalAccount.deposit();    // Inherited from Parent
        personalAccount.addInterest(); // Specific to Child 1

        System.out.println("\n--- Testing Current Bank Child ---");
        CurrentBank businessAccount = new CurrentBank();
        businessAccount.deposit();       // Inherited from same Parent
        businessAccount.overDraftLimit(); // Specific to Child 2

        System.out.println("\nCommon Bank Name: " + personalAccount.bankName);
        System.out.println("Main method ended successfully");
    }
}