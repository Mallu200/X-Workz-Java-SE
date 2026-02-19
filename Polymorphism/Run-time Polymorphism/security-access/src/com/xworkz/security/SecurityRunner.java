package com.xworkz.security;

public class SecurityRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Scenario: A login system returns a 'User' reference
        User currentUser;

        // 1. A standard user logs in
        currentUser = new User("Rahul_99");
        currentUser.displayDashboard();
        currentUser.accessPermissions();

        System.out.println("---------------------------");

        // 2. An admin logs in
        // Note: The reference type is still 'User', but behavior changes at runtime
        currentUser = new Admin("Super_Admin_X");
        currentUser.displayDashboard();
        currentUser.accessPermissions();

        System.out.println("Main method ended.");
    }
}
