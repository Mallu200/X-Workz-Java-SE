class AutoSave implements Runnable {
	public void run() {
		// Automatically saves progreess to a temp file 
		System.out.println("Auto-saving document... " + Thread.currentThrea().getName());
	}
}

public class WordApp {
	public static void main(String[] args) {
		Thread saver = new Thread(new AutoSave());
		saver.setPriority(Thread.MIN_PRIORITY); // Lower priority for background task
		saver.start();
		System.out.println("User is typing text on the main thread... ");
	}
}