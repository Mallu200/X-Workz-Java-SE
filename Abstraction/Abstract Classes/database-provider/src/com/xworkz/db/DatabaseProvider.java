package com.xworkz.db;

public abstract class DatabaseProvider {

    // Concrete method: Every DB must verify the license the same way
    public void verifyLicense() {
        System.out.println("Invoking verifyLicense in DatabaseProvider");
        System.out.println(">> Standard security check: License is valid.");
    }

    // Abstract methods: Every DB connects and disconnects differently
    public abstract void connect();
    public abstract void executeQuery(String query);
}