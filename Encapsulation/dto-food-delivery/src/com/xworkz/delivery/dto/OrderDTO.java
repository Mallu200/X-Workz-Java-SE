package com.xworkz.delivery.dto;

import java.util.Objects;

public class OrderDTO {
    // 1. Private Properties
    private long orderId;
    private String restaurantName;
    private String items;
    private double billAmount;
    private String status; // e.g., "Pending", "Delivered"

    // 2. No-Argument Constructor
    public OrderDTO() {
        System.out.println("Invoking No-arg constructor in OrderDTO");
    }

    // 3. All-Argument Constructor
    public OrderDTO(long orderId, String restaurantName, String items, double billAmount, String status) {
        System.out.println("Invoking All-arg constructor in OrderDTO");
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.items = items;
        this.billAmount = billAmount;
        this.status = status;
    }

    // 4. Getters and Setters
    public long getOrderId() { return orderId; }
    public void setOrderId(long orderId) { this.orderId = orderId; }

    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }

    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // 5. Overriding toString()
    @Override
    public String toString() {
        return "OrderDTO [ID=" + orderId + ", Restaurant=" + restaurantName +
                ", Items=" + items + ", Total=" + billAmount + ", Status=" + status + "]";
    }

    // 6. Overriding hashCode and equals (Strictly based on orderId)
    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        OrderDTO other = (OrderDTO) obj;
        return orderId == other.orderId;
    }
}