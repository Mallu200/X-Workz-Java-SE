package com.xworkz.payment;

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Concrete method: All payments show this same behavior
    public void displayAmount(){
        System.out.println("Payment Amount: ₹" + amount);
    }

    // Abstract method: NO BODY. Child classes MUST implement this.
    public abstract void processPayment();
}
