package com.xworkz.restaurant.dto;

import com.xworkz.restaurant.enums.FoodType;

import java.util.Objects;

public class FoodItemDTO {
    // Private properties
    private String itemName;
    private double price;
    private FoodType type; // Enum property

    // Default Constructor
    public FoodItemDTO() {}

    // Parameterized Constructor
    public FoodItemDTO(String itemName, double price, FoodType type) {
        this.itemName = itemName;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public FoodType getType() { return type; }
    public void setType(FoodType type) { this.type = type; }

    // Object Methods
    @Override
    public String toString() {
        return "FoodItemDTO [itemName=" + itemName + ", price=" + price + ", type=" + type + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItemDTO that = (FoodItemDTO) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(itemName, that.itemName) &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price, type);
    }
}