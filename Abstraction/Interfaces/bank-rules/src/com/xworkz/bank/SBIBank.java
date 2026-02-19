package com.xworkz.bank;

public class SBIBank implements RBIRules {

    @Override
    public void openAccount(String identityProof) {
        System.out.println("Invoking openAccount in SBI");
        System.out.println(">> [SBI] Verifying " + identityProof + " via Aadhar Portal.");
    }

    @Override
    public void processWithdrawal(double amount) {
        System.out.println(">> [SBI] Dispensing cash from local branch/ATM. Amount: " + amount);
    }

    @Override
    public void checkKYCStatus() {
        System.out.println(">> [SBI] KYC verified through YONO App.");
    }
}
