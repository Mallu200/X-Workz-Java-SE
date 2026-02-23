import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StatementGenerator {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int userId = i;
            service.execute(() -> {
                System.out.println("Generating Statement for User " + userId + " via " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}