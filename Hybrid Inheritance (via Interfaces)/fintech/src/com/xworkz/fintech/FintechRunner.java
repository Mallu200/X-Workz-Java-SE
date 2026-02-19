package com.xworkz.fintech;

public class FintechRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in FintechRunner");

        DigitalAccount myAccount = new DigitalAccount();

        System.out.println("Project: Fintech Hybrid Inheritance");
        System.out.println("----------------------------------");

        // 1. From Grandparent (Multilevel)
        myAccount.checkBalance();

        // 2. From Parent (Multilevel)
        myAccount.calculateInterest();

        // 3. From WebPortal Interface (Multiple)
        myAccount.loginOnline();

        // 4. From SecurityProtocol Interface (Multiple)
        myAccount.enableTwoFactor();

        System.out.println("Main method ended successfully");
    }
}