package com.xworkz.fintech;

// DigitalAccount 'Is-A' SavingsAccount (Multilevel)
// AND implements WebPortal, SecurityProtocol (Multiple)
public class DigitalAccount extends SavingsAccount implements WebPortal, SecurityProtocol {

    @Override
    public void loginOnline() {
        System.out.println("Invoking loginOnline in DigitalAccount"); // Mandatory SOP
        System.out.println(">> [WEB] Session started via secure browser portal.");
    }

    @Override
    public void enableTwoFactor() {
        System.out.println("Invoking enableTwoFactor in DigitalAccount"); // Mandatory SOP
        System.out.println(">> [SECURE] OTP sent to registered mobile number.");
    }
}