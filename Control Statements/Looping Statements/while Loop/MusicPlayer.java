class MusicPlayer {
	public static void main(String[] args) {
		System.out.println("Main started");

		int volume = 0;
		int maxLimit = 15;
		
		System.out.println("Increasing volume...");
		
		// WHILE LOOP: Volume Safeguard
		// The loop checks if 'volume' is within the 'maxLimit' BEFORE printing.
		// If volume was 16 initially, the loop would not run at all.
		while (volume <= maxLimit) {
			System.out.println("Volume Level: " + volume);
			
			// UPDATE: Increasing the volume by 1 in each iteration
			volume++; 
		}
		
		System.out.println("Maximum safe volume reached!");

		System.out.println("Main ended");
	}
}