package com.xworkz.delivery;

public class GoldMembership extends DeliveryService {

    @Override
    public void calculateTotal(double foodPrice, int distanceKm) {
        System.out.println("Invoking calculateTotal in GoldMembership");
        // Gold logic: Delivery fee is always 0
        double deliveryFee = 0.0;
        double total = foodPrice + deliveryFee;
        System.out.println(">> [GOLD] Food: ₹" + foodPrice + " | Delivery: FREE");
        System.out.println(">> Final Bill: ₹" + total);
    }
}
