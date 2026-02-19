class Product {
    double price;
    int discountPercent;

    // Version 1: Regular Price (No discount)
    // Logic: Simply assigns the price as it is
    Product(double price) {
        System.out.println("Constructor 1 (Standard) started");
        this.price = price;
        this.discountPercent = 0; 
    }

    // Version 2: Sale Price (Applies discount)
    // Logic: Calculates the final price after subtracting the discount
    Product(double price, int discountPercent) {
        System.out.println("Constructor 2 (Sale) started");
        this.discountPercent = discountPercent;
        // Math: Deducting the percentage from the base price
        this.price = price - (price * discountPercent / 100.0);
    }
	
    void display() {
        System.out.println("Final Price: ₹" + price + " | Discount Applied: " + discountPercent + "%");
    }
	
    public static void main(String args[]) {
        System.out.println("Main method started");

        // Object 1: Full price item
        Product p1 = new Product(1000);
        
        // Object 2: Discounted item (10% off)
        Product p2 = new Product(1000, 10); 
        
        p1.display();
        p2.display();

        System.out.println("Main method ended");
    }
}