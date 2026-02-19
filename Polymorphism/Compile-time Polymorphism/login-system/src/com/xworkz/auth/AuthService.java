package com.xworkz.auth;

public class AuthService {

    // 1. Login using Email and Password
    public void login(String email, String password) {
        System.out.println("Invoking login with Email");
        System.out.println(">> Authenticating " + email + " with encrypted password check.");
    }

    // 2. Login using Phone Number and OTP (Different types: String and int)
    public void login(long phoneNumber, int otp) {
        System.out.println("Invoking login with Phone Number");
        System.out.println(">> Sending request to Telecom provider for phone: " + phoneNumber);
        System.out.println(">> Verifying 4-digit OTP: " + otp);
    }

    // 3. Login using a Social Media Token (Single parameter)
    public void login(String socialToken) {
        System.out.println("Invoking login with Social Token");
        System.out.println(">> Validating OAuth2 token with Google/Facebook servers.");
    }
}