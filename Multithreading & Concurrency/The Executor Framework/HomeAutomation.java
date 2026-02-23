import java.util.concurrent.*;

public class HomeAutomation {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        System.out.println("System initialized. Security scan scheduled in 3 seconds...");

        // Task: Security Scan
        Runnable scanTask = () -> System.out.println("Security Scan Complete at: " + System.currentTimeMillis());

        // Schedule to run once after 3 seconds
        scheduler.schedule(scanTask, 3, TimeUnit.SECONDS);

        // Schedule to run every 5 seconds (periodic)
        // scheduler.scheduleAtFixedRate(scanTask, 0, 5, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}