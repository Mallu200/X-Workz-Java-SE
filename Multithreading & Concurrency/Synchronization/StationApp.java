class SpeakerSystem {
    public static synchronized void announce(String train) {
        System.out.println("--- START ANNOUNCEMENT ---");
        System.out.println("Train: " + train + " is arriving on Platform 1.");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("--- END ANNOUNCEMENT ---");
    }
}

public class StationApp {
    public static void main(String[] args) {
        new Thread(() -> SpeakerSystem.announce("Express 101")).start();
        new Thread(() -> SpeakerSystem.announce("Local 202")).start();
    }
}