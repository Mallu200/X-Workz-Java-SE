import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WebRequest implements Runnable {
    private final int taskId;
    WebRequest(int id) { this.taskId = id; }

    @Override
    public void run() {
        System.out.println("User " + taskId + " being handled by: " + Thread.currentThread().getName());
        try { Thread.sleep(500); } catch (InterruptedException e) {}
    }
}

public class ServerApp {
    public static void main(String[] args) {
        // Only 3 threads exist, regardless of how many tasks we send
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            executor.execute(new WebRequest(i));
        }
        
        executor.shutdown(); 
    }
}