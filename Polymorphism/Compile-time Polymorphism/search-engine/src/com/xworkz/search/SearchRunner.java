package com.xworkz.search;

public class SearchRunner {
    public static void main(String[] args) {
        SearchEngine amazon = new SearchEngine();

        System.out.println("--- User Action 1 ---");
        amazon.find("Laptop"); // Calls version 1

        System.out.println("\n--- User Action 2 ---");
        amazon.find("iPhone 15", "Electronics"); // Calls version 2

        System.out.println("\n--- User Action 3 ---");
        amazon.find(998877); // Calls version 3

        System.out.println("\n--- User Action 4 ---");
        amazon.find(1500.0, 5000.0); // Calls version 4
    }
}