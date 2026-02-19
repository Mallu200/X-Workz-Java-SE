package com.xworkz.bank;

public class HDFCBank implements RBIRules {

    @Override
    public void openAccount(String identityProof) {
        System.out.println("Invoking openAccount in HDFC");
        System.out.println(">> [HDFC] Online account opening using Video-KYC and " + identityProof);
    }

    @Override
    public void processWithdrawal(double amount) {
        System.out.println(">> [HDFC] Processing NetBanking transfer. Amount: " + amount);
    }

    @Override
    public void checkKYCStatus() {
        System.out.println(">> [HDFC] KYC check completed via Private Relationship Manager.");
    }
}