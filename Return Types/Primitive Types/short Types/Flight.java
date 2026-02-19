class Flight {
    // short is ideal for passenger counts (usually < 1000)
    static short getPassengerCount() {
        // Logic: Returns the number of people on board
        return 186; 
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        short total = getPassengerCount();
        System.out.println("Total Passengers: " + total);
        System.out.println("Main ended");
    }
}