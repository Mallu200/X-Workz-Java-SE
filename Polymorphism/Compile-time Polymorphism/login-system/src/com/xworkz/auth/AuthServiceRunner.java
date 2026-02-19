package com.xworkz.auth;

public class AuthServiceRunner {
    public static void main(String[] args) {
        AuthService auth = new AuthService();

        System.out.println("--- Method 1: Standard Login ---");
        auth.login("user@xworkz.com", "SecurePass123");

        System.out.println("\n--- Method 2: Mobile Login ---");
        auth.login(9886012345L, 5544);

        System.out.println("\n--- Method 3: Quick Login ---");
        auth.login("TOKEN_XYZ_789_ABC");
    }
}
