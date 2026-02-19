class University {
    // short is used for seating capacities of large halls
    static short getHallCapacity() {
        // Logic: Returns maximum seating capacity
        return 1200;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        short capacity = getHallCapacity();
        System.out.println("Main Hall Capacity: " + capacity + " seats");
        System.out.println("Main ended");
    }
}