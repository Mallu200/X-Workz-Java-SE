class MovieTheater {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Step 1: Create a boolean array for 3 seats
        boolean[] isBooked = new boolean[3];

        // Step 2: Mark seats as booked
        isBooked[0] = true;
        isBooked[2] = true;

        System.out.println("Is Seat 1 Booked? " + isBooked[0]);
        System.out.println("Is Seat 2 Booked? " + isBooked[1]); // Prints 'false' (Default)

        System.out.println("Main ended");
    }
}