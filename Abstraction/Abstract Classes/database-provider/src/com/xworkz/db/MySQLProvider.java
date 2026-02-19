package com.xworkz.db;

public class MySQLProvider extends DatabaseProvider {

    @Override
    public void connect() {
        System.out.println("Invoking connect in MySQLProvider");
        System.out.println(">> Connecting to MySQL on Port 3306 using JDBC driver.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println(">> MySQL executing: " + query);
    }
}
