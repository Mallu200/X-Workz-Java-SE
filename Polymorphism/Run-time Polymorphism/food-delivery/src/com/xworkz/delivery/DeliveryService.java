package com.xworkz.delivery;

public class DeliveryService {

    public void calculateTotal(double foodPrice, int distanceKm) {
        System.out.println("Invoking calculateTotal in DeliveryService");
        double deliveryFee = distanceKm * 10.0; // ₹10 per km
        double total = foodPrice + deliveryFee;
        System.out.println(">> [REGULAR] Food: ₹" + foodPrice + " | Delivery: ₹" + deliveryFee);
        System.out.println(">> Final Bill: ₹" + total);
    }
}