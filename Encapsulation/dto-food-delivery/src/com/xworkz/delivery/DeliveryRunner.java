package com.xworkz.delivery;

import com.xworkz.delivery.dto.OrderDTO;

public class DeliveryRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in DeliveryRunner");

        // Creating Order 1 via All-args constructor
        OrderDTO order1 = new OrderDTO(987654L, "Paradise Biryani", "Mutton Biryani, Coke", 450.0, "Dispatched");

        // Creating Order 2 via No-args and Setters
        OrderDTO order2 = new OrderDTO();
        order2.setOrderId(123456L);
        order2.setRestaurantName("Pizza Hut");
        order2.setItems("Margherita Pizza");
        order2.setBillAmount(299.0);
        order2.setStatus("Pending");

        System.out.println("\n--- Order Summary ---");
        System.out.println(order1);
        System.out.println(order2);

        // Testing Equality: Even if restaurant/items are different,
        // same Order ID means same order in our system logic.
        OrderDTO order3 = new OrderDTO(987654L, "Unknown Cafe", "Water", 20.0, "Cancelled");
        System.out.println("\nIs Order 1 duplicate of Order 3? " + order1.equals(order3));

        System.out.println("Main method ended successfully");
    }
}