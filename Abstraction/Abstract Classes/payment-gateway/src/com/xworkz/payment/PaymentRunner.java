package com.xworkz.payment;

public class PaymentRunner {
    public static void main(String[] args) {
        System.out.println("Main started...");

        // Payment p = new Payment(500); // ERROR! You cannot create an object of an abstract class.

        Payment upi = new UPIPayment(1500.0, "user@okaxis");
        upi.displayAmount();
        upi.processPayment();

        System.out.println("-------------------");

        Payment card = new CardPayment(5000.0, "1234-5678-9012");
        card.displayAmount();
        card.processPayment();

        System.out.println("Main ended.");
    }
}
