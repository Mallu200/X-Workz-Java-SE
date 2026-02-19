package com.xworkz.delivery;

public class DeliveryRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Parent Reference
        DeliveryService currentOrder;

        // Scenario A: A Regular User orders
        currentOrder = new DeliveryService();
        currentOrder.calculateTotal(450.0, 5);

        System.out.println("---------------------------");

        // Scenario B: A Gold Member orders
        // The same method 'calculateTotal' is called, but the behavior changes
        currentOrder = new GoldMembership();
        currentOrder.calculateTotal(450.0, 5);

        System.out.println("Main method ended.");
    }
}