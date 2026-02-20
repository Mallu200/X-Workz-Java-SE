package com.xworkz.payment;

import com.xworkz.payment.dto.PaymentDTO;
import com.xworkz.payment.enums.PaymentMode;

public class PaymentRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating the Payment DTO with a specific mode from the Enum
        PaymentDTO payment = new PaymentDTO("TXN12345", 1500.50, PaymentMode.UPI);

        // Printing data using Getters and mandatory SOPs
        System.out.println("Invoking getTransactionId: " + payment.getTransactionId());
        System.out.println("Invoking getAmount: " + payment.getAmount());
        System.out.println("Invoking getMode: " + payment.getMode());

        // Displaying the complete object state
        System.out.println("Payment Details: " + payment.toString());

        // Changing the payment mode to CARD using the Setter
        payment.setMode(PaymentMode.CARD);
        System.out.println("Updated Payment Mode: " + payment.getMode());

        System.out.println("Main method ended.");
    }
}
