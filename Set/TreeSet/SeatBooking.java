import java.util.TreeSet;

class SeatBooking {
    public static void main(String[] args) {
        TreeSet<Integer> availableSeats = new TreeSet<>();
        availableSeats.add(5);
        availableSeats.add(1);
        availableSeats.add(10);
        availableSeats.add(2);

        System.out.println("Next available seat: " + availableSeats.first()); // 1
    }
}