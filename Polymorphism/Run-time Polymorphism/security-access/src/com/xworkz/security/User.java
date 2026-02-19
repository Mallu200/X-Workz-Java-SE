package com.xworkz.security;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void displayDashboard() {
        System.out.println("Invoking displayDashboard in User");
        System.out.println(">> [USER] Welcome, " + username + ". Showing your recent activity and profile.");
    }

    public void accessPermissions() {
        System.out.println(">> [USER] Permission Level: READ-ONLY.");
    }
}