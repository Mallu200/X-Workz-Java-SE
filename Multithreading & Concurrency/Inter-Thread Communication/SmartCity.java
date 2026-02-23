class TrafficControl {
    private boolean emergencyPassing = false;

    synchronized void normalTraffic() throws InterruptedException {
        while (emergencyPassing) {
            System.out.println("Car: Pulling over, waiting for Ambulance...");
            wait();
        }
        System.out.println("Car: Driving normally.");
    }

    synchronized void ambulanceArrives() {
        System.out.println("AMBULANCE ARRIVING!");
        emergencyPassing = true;
    }

    synchronized void ambulancePasses() {
        System.out.println("Ambulance passed. Resuming traffic.");
        emergencyPassing = false;
        notifyAll();
    }
}

public class SmartCity {
    public static void main(String[] args) throws InterruptedException {
        TrafficControl tc = new TrafficControl();
        new Thread(() -> { try { tc.normalTraffic(); } catch(Exception e){} }).start();

        tc.ambulanceArrives();
        Thread.sleep(2000);
        tc.ambulancePasses();
    }
}