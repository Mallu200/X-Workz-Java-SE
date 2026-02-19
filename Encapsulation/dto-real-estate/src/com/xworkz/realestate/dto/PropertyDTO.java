package com.xworkz.realestate.dto;

import java.util.Objects;

public class PropertyDTO {
    // 1. Private Properties
    private String propertyId;
    private String location;
    private String type; // e.g., Apartment, Villa, Plot
    private double areaInSqFt;
    private double price;

    // 2. No-Argument Constructor
    public PropertyDTO() {
        System.out.println("Invoking No-arg constructor in PropertyDTO");
    }

    // 3. All-Argument Constructor
    public PropertyDTO(String propertyId, String location, String type, double areaInSqFt, double price) {
        System.out.println("Invoking All-arg constructor in PropertyDTO");
        this.propertyId = propertyId;
        this.location = location;
        this.type = type;
        this.areaInSqFt = areaInSqFt;
        this.price = price;
    }

    // 4. Getters and Setters
    public String getPropertyId() { return propertyId; }
    public void setPropertyId(String propertyId) { this.propertyId = propertyId; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getAreaInSqFt() { return areaInSqFt; }
    public void setAreaInSqFt(double areaInSqFt) { this.areaInSqFt = areaInSqFt; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // 5. Overriding toString()
    @Override
    public String toString() {
        return "PropertyDTO [ID=" + propertyId + ", Location=" + location +
                ", Type=" + type + ", Area=" + areaInSqFt + "sqft, Price=" + price + "]";
    }

    // 6. Overriding hashCode and equals (Based on unique propertyId)
    @Override
    public int hashCode() {
        return Objects.hash(propertyId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PropertyDTO other = (PropertyDTO) obj;
        return Objects.equals(propertyId, other.propertyId);
    }
}