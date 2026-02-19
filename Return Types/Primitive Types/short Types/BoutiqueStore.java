class BoutiqueStore {
    // short is great for small-scale inventory management
    static short getStockQuantity() {
        // Logic: Returns items available in the warehouse
        return 5400;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        short items = getStockQuantity();
        System.out.println("Items in Warehouse: " + items);
        System.out.println("Main ended");
    }
}