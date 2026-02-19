package com.xworkz.payment;

public class PaymentProcessor {

    // 1. Pay using UPI (Single String parameter)
    public void pay(String upiId, double amount) {
        System.out.println("Invoking pay via UPI");
        System.out.println(">> Processing ₹" + amount + " for UPI ID: " + upiId);
    }

    // 2. Pay using Credit Card (Multiple parameters)
    public void pay(long cardNumber, int cvv, String expiry) {
        System.out.println("Invoking pay via Credit Card");
        System.out.println(">> Validating Card: " + cardNumber + " | Expiry: " + expiry);
        System.out.println(">> Securely processing transaction...");
    }

    // 3. Pay using Bank Transfer (Different parameter types)
    public void pay(String accountHolder, long accountNumber, String ifscCode) {
        System.out.println("Invoking pay via NEFT/IMPS");
        System.out.println(">> Transferring funds to " + accountHolder);
        System.out.println(">> Account: " + accountNumber + " | IFSC: " + ifscCode);
    }
}