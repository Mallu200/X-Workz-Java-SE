package com.xworkz.finance;

public class BankSystem {
    // Grandparent attribute
    public String securityLevel = "AES-256 Encryption";

    // Grandparent method
    public void validateCredentials() {
        System.out.println("Invoking validateCredentials in BankSystem"); // Mandatory SOP
        System.out.println(">> [SECURITY] Verifying user identity through secure gateway...");
    }
}