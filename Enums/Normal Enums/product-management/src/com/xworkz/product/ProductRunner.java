package com.xworkz.product;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.enums.Category;

public class ProductRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating the Product DTO and assigning an Enum constant
        ProductDTO product = new ProductDTO(1001, "Smartphone", Category.ELECTRONICS);

        // Accessing data using Getters and printing with mandatory SOPs
        System.out.println("Invoking getProductId: " + product.getProductId());
        System.out.println("Invoking getProductName: " + product.getProductName());
        System.out.println("Invoking getCategory: " + product.getCategory());

        // Printing the full state of the DTO
        System.out.println("Product Info: " + product.toString());

        // Updating the category to show dynamic behavior
        product.setCategory(Category.GROCERY);
        System.out.println("Updated Category: " + product.getCategory());

        System.out.println("Main method ended.");
    }
}