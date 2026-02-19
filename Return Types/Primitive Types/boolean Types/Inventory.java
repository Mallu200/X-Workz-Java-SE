class Inventory {
    // boolean is the standard for "Is" or "Has" questions
    static boolean isItemInStock() {
        // Logic: Checks if quantity > 0
        return true; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        boolean available = isItemInStock();
        System.out.println("Can purchase item: " + available);
        System.out.println("Main ended");
    }
}