package com.xworkz.finance;

public class FinanceRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in FinanceRunner"); // Start log

        // Instantiate the specific Child class
        FixedDeposit myFD = new FixedDeposit();

        System.out.println("Project: Finance Multilevel Inheritance");
        System.out.println("--------------------------------------");

        // 1. Calling Grandparent behavior (Security)
        myFD.validateCredentials();

        // 2. Calling Parent behavior (Account)
        myFD.checkBalance();

        // 3. Calling Child behavior (FD specific)
        myFD.calculateMaturity();

        // 4. Accessing attributes across levels
        System.out.println("System Security: " + myFD.securityLevel); // From Grandparent
        System.out.println("FD Interest Rate: " + myFD.interestRate + "%"); // From Child

        System.out.println("Main method ended successfully"); // End log
    }
}