package com.xworkz.payment.dto;

import com.xworkz.payment.enums.PaymentMode;

import java.util.Objects;

public class PaymentDTO {
    // Private properties representing the data
    private String transactionId;
    private double amount;
    private PaymentMode mode; // Enum property

    // No-arg constructor
    public PaymentDTO() {
        // Default constructor
    }

    // Parameterized constructor
    public PaymentDTO(String transactionId, double amount, PaymentMode mode) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.mode = mode;
    }

    // Standard Getters and Setters
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public PaymentMode getMode() { return mode; }
    public void setMode(PaymentMode mode) { this.mode = mode; }

    // Overriding Object methods for standard output and comparison
    @Override
    public String toString() {
        return "PaymentDTO [transactionId=" + transactionId + ", amount=" + amount + ", mode=" + mode + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDTO that = (PaymentDTO) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(transactionId, that.transactionId) && mode == that.mode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, amount, mode);
    }
}
