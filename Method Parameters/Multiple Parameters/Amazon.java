class Amazon {
    // Parameter 1: double price, Parameter 2: char membershipType
    static void applyDiscount(double price, char membershipType) {
        System.out.println("Method applyDiscount started");
        
        System.out.println("Original Price: ₹" + price);
        System.out.println("Membership Level: " + membershipType);
        System.out.println("Status: Discount applied based on grade " + membershipType);
        
        System.out.println("Method applyDiscount ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        
        // Passing arguments: double first, char second
        applyDiscount(1599.50, 'P'); // 'P' for Prime
        
        System.out.println("Main ended");
    }
}