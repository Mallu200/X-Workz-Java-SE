public class SystemApp {
    public static void main(String[] args) throws InterruptedException {
        Thread cleanupThread = new Thread(() -> {
            System.out.println("Deleting temp files...");
        });

        cleanupThread.start();
        
        // Wait for it to finish so we can check the state
        cleanupThread.join(); 
        
        System.out.println("Thread alive? " + cleanupThread.isAlive()); // Returns false
        System.out.println("Thread State: " + cleanupThread.getState()); // Returns TERMINATED
    }
}