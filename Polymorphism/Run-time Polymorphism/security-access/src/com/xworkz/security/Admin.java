package com.xworkz.security;

public class Admin extends User {

    public Admin(String username) {
        super(username);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Invoking displayDashboard in Admin");
        System.out.println(">> [ADMIN] ACCESS GRANTED. Showing Server Logs, User Analytics, and System Health.");
    }

    @Override
    public void accessPermissions() {
        System.out.println(">> [ADMIN] Permission Level: FULL ACCESS (Read, Write, Delete).");
    }
}