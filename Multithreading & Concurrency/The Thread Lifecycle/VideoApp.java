public class VideoApp {
	public static void main(String[] args) {
		Thread videoThread = new Thread(() -> {
			System.out.println("Video is playing...");
			try {
				// Thread enterss TIMED_WAITING state
				Thread.sleep(2000);
				System.out.println("Buffering complete, resuming...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		videoThread.start();
	}
}