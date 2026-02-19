class AuthSystem {
    // int is used for numeric security codes
    static int getSecurityOTP() {
        // Logic: Returns a 6-digit random code
        return 458219;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        int otp = getSecurityOTP();
        System.out.println("Your Login OTP is: " + otp);
        System.out.println("Main ended");
    }
}