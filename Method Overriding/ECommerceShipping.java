class Amazon {
    // Parent Method: General shipping policy for all customers
    void ship() {
        System.out.println("Method ship (Parent) started");
        
        System.out.println("Shipping: Standard (5-7 Days)");
        
        System.out.println("Method ship (Parent) ended");
    }
}

class PrimeMember extends Amazon {
    // Overriding: Redefining shipping logic for specialized members
    @Override
    void ship() {
        System.out.println("Method ship (Child) started");
        
        // Specific Logic: Prime members get faster shipping
        System.out.println("Shipping: Express (1-Day Delivery)");
        
        System.out.println("Method ship (Child) ended");
    }
}

class ECommerceShipping {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // The object created determines which version of the method runs
        PrimeMember user = new PrimeMember();
        
        // Even though ship() exists in both classes, the child version wins
        user.ship();

        System.out.println("Main method ended");
    }
}