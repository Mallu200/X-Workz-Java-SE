class WhatsApp {
    // Parameter 1: long mobileNumber, Parameter 2: boolean isBusiness
    static void verifyContact(long mobileNumber, boolean isBusiness) {
        System.out.println("Method verifyContact started");
        
        System.out.println("Checking Number: +91-" + mobileNumber);
        System.out.println("Is Business Account: " + isBusiness);
        
        System.out.println("Method verifyContact ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing arguments: long first, boolean second
        verifyContact(9876543210L, true);
        
        System.out.println("Main ended");
    }
}