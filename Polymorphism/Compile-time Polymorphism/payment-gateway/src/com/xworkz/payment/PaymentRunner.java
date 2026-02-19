package com.xworkz.payment;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentProcessor gateway = new PaymentProcessor();

        System.out.println("--- Scenario 1: Quick UPI Payment ---");
        gateway.pay("user@okaxis", 500.0);

        System.out.println("\n--- Scenario 2: Shopping with Credit Card ---");
        gateway.pay(451278963214L, 991, "12/28");

        System.out.println("\n--- Scenario 3: Large Business Transfer ---");
        gateway.pay("X-Workz Admin", 1020304050L, "BIN000123");
    }
}
