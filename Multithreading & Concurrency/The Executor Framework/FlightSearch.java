import java.util.concurrent.*;

public class FlightSearch {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit returns a "Future" (like a receipt for a pizza you're waiting for)
        Future<String> airlineA = executor.submit(() -> {
            Thread.sleep(2000); // Simulate network delay
            return "Delta: $450";
        });

        Future<String> airlineB = executor.submit(() -> {
            Thread.sleep(1000);
            return "United: $420";
        });

        System.out.println("Searching for flights...");

        // .get() is a blocking call. It waits until the result is ready.
        System.out.println("Result 1: " + airlineA.get());
        System.out.println("Result 2: " + airlineB.get());

        executor.shutdown();
    }
}