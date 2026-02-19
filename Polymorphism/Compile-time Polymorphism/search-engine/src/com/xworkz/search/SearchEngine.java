package com.xworkz.search;

public class SearchEngine {

    // 1. Search by Name only
    public void find(String productName) {
        System.out.println("Searching for product: " + productName);
    }

    // 2. Search by Name and Category (Different number of parameters)
    public void find(String productName, String category) {
        System.out.println("Searching for '" + productName + "' in the '" + category + "' section.");
    }

    // 3. Search by Product ID (Different type of parameter)
    public void find(int productId) {
        System.out.println("Searching for specific Product ID: #" + productId);
    }

    // 4. Search by Price Range (Different number and types)
    public void find(double minPrice, double maxPrice) {
        System.out.println("Filtering products between ₹" + minPrice + " and ₹" + maxPrice);
    }
}
