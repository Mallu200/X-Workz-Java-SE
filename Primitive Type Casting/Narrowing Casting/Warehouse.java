class Warehouse {
    public static void main(String[] args) {
        long globalStock = 500000L;
        int localStock = (int) globalStock; // Manual Narrowing

        System.out.println("Global Inventory: " + globalStock);
        System.out.println("Local Warehouse Count: " + localStock);
    }
}