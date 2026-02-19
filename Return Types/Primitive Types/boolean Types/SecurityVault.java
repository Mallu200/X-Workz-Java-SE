class SecurityVault {
    // boolean acts as a security flag
    static boolean isAccountLocked() {
        // Logic: Returns true if the user is barred from entry
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        boolean locked = isAccountLocked();
        System.out.println("Access Blocked: " + locked);
        System.out.println("Main ended");
    }
}