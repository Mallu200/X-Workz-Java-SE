class Downloader {
	public static void main(String[] args) {
		System.out.println("Main started");

		int progress = 0; // Initialization: Start at 0%
		
		// WHILE LOOP: 
		// Continues as long as progress has not exceeded 100%
		while (progress <= 100) {
			System.out.println("Downloading..." + progress + "%");
			
			// UPDATE: Simulating data chunks being received (25% at a time)
			progress = progress + 25; 
		}
		
		System.out.println("Download Complete!");

		System.out.println("Main ended");
	}
}