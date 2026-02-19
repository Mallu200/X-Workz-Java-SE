package com.xworkz.payment;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Invoking processPayment in CardPayment");
        System.out.println(">> Swiping Card: " + cardNumber);
        System.out.println(">> Verifying CVV and Expiry... Transaction Approved!");
    }
}
