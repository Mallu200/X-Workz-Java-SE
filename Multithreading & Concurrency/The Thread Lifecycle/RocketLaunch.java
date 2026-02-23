public class RocketLaunch {
	public static void main(String[] args) {
		Thread timerThread = new Thread(() -> {
			for (int i = 3; i > 0; i--) {
				System.out.println("T-minus: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
			System.out.println("Liftoff!");
		});
		
		timerThread.start();
	}
}