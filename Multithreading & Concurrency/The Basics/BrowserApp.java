// Implementing Runnable is the professional way
class FileDownloader implements Runnable {
	private String fileName;
	FileDownloader(String name) { this.fileName = name; }
	
	@Override
	public void run() {
		// Simulates a background download process
		System.out.println("Downloading " + fileName + " on thread: " + Thread.currentThread().getName());
	}
}

public class BrowserApp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new FileDownloader("Image.png"));
		Thread t2 = new Thread(new FileDownloader("Video.mp4"));
		t1.start(); // Starts download 1
		t2.start(); // Starts download 2
	}
}