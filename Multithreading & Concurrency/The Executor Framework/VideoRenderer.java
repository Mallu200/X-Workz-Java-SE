import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VideoRenderer {
    public static void main(String[] args) {
        ExecutorService renderPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int frame = 0; frame < 100; frame += 25) {
            int startFrame = frame;
            renderPool.execute(() -> {
                System.out.println("Rendering frames " + startFrame + " to " + (startFrame + 24) + " on " + Thread.currentThread().getName());
            });
        }
        renderPool.shutdown();
    }
}