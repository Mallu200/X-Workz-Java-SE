package com.xworkz.db;

public class OracleProvider extends DatabaseProvider {

    @Override
    public void connect() {
        System.out.println("Invoking connect in OracleProvider");
        System.out.println(">> Connecting to Oracle DB on Port 1521 using TNS listener.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println(">> Oracle executing: " + query);
    }
}