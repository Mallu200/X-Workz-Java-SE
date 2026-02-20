package com.xworkz.product.dto;

import com.xworkz.product.enums.Category;

import java.util.Objects;

public class ProductDTO {
    // Private properties for Encapsulation
    private int productId;
    private String productName;
    private Category category; // Using Enum as a type-safe property

    // No-arg constructor
    public ProductDTO() {
        // Default constructor
    }

    // Parameterized constructor
    public ProductDTO(int productId, String productName, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Standard Getters and Setters with descriptive names
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    // Overriding toString for meaningful object representation
    @Override
    public String toString() {
        return "ProductDTO [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
    }

    // Overriding equals and hashCode for object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return productId == that.productId && Objects.equals(productName, that.productName) && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, category);
    }
}