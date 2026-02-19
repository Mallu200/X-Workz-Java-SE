class ParkingLot {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Step 1: Declaration & Allocation (Size 4)
        String[] slots = new String[4];

        // Step 2: Initialization
        slots[0] = "KA-01-AB-1234";
        slots[1] = "KA-05-MN-5678";

        System.out.println("Total Capacity: " + slots.length);
        System.out.println("Vehicle in Slot 1: " + slots[0]);
        System.out.println("Vehicle in Slot 3: " + slots[2]); // Prints 'null' (Default)

        System.out.println("Main ended");
    }
}