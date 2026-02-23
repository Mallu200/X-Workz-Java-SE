class GPStracker implements Runnable {
	@Override
	public void run() {
		// Updates rider location coordinates every few seconds
		System.out.println("Fetcging live rider location... " + Thread.currentThread().getName());
	}
}

public class UberEats {
	public static void main(String[] args) {
		Thread liveTracking = new Thread(new GPStracker());
		liveTracking.start(); // Tracking starts while UI remains responsive
		System.out.println("User is browsing the menu....");
	}
}