package com.xworkz.bank;

public interface RBIRules {
    // Interface variables are public, static, and final by default
    double MIN_INTEREST_RATE = 2.5;

    // Contract methods
    void openAccount(String identityProof);
    void processWithdrawal(double amount);
    void checkKYCStatus();
}
