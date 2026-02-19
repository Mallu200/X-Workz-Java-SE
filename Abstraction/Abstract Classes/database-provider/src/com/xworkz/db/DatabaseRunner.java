package com.xworkz.db;

public class DatabaseRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Scenario: Imagine the user chooses MySQL in settings
        DatabaseProvider db = new MySQLProvider();
        db.verifyLicense();
        db.connect();
        db.executeQuery("SELECT * FROM employees");

        System.out.println("---------------------------");

        // Scenario: Imagine the company migrates to Oracle
        db = new OracleProvider(); // Re-assigning the abstract reference
        db.verifyLicense();
        db.connect();
        db.executeQuery("UPDATE salary SET amount = 50000");

        System.out.println("Main method ended.");
    }
}
