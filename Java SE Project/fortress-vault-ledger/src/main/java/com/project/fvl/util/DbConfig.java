package com.project.fvl.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * JSE Topic: Static Initializers & File I/O
 * This utility loads database credentials from an external properties file.
 */
public class DbConfig {
    // JSE Topic: Collections (Properties is a subclass of Hashtable)
    private static final Properties properties = new Properties();

    // JSE Topic: Static Block - Runs once when the class is first loaded into memory
    static {
        System.out.println("--> [System]: Initializing Database Configuration...");

        // JSE Topic: Try-with-resources & ClassLoader I/O
        try (InputStream input = DbConfig.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                System.err.println("!! [ERROR]: Critical Failure - 'db.properties' not found in classpath.");
            } else {
                properties.load(input);
                System.out.println("--> [System]: Configuration loaded successfully from 'db.properties'.");
            }

            // Helpful SOP for debugging connection strings
            System.out.println("--> [System]: Target DB -> " + properties.getProperty("db.url"));

        } catch (Exception e) {
            System.err.println("!! [ERROR]: Failed to load database configuration.");
            e.printStackTrace();
        }
    }

    // Static Getter Methods for easy access across the Repository layer
    public static String getUrl() { return properties.getProperty("db.url"); }
    public static String getUser() { return properties.getProperty("db.user"); }
    public static String getPass() { return properties.getProperty("db.pass"); }
}