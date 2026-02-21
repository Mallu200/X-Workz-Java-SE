class Calculator {
    public static void main(String[] args) {
        Integer price = 100; // Autoboxed
        int tax = 18;
        
        // Unboxing happens automatically here to perform addition
        int total = price + tax; 
        
        System.out.println("Total Price: " + total);
    }
}