class Bus {
    private boolean isSeatReserved = false;

    public synchronized void reserveSeat() {
        if (!isSeatReserved) {
            System.out.println("Seat 5 reserved for " + Thread.currentThread().getName());
            isSeatReserved = true;
        } else {
            System.out.println("Sorry " + Thread.currentThread().getName() + ", Seat 5 is already taken!");
        }
    }
}

public class BookingApp {
    public static void main(String[] args) {
        Bus greyhound = new Bus();
        
        new Thread(greyhound::reserveSeat, "Traveler-A").start();
        new Thread(greyhound::reserveSeat, "Traveler-B").start();
    }
}