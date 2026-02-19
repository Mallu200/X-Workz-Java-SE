package com.xworkz.payment;

public class UPIPayment extends Payment{
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Invoking processPayment in UPIPayment");
        System.out.println(">> Processing UPI payment via ID: " + upiId);
        System.out.println(">> Authenticating with Bank Server... Success!");
    }
}
