class Gadget {
	
	// Smallest integer type for counts (8-bit)
	static byte portCount; 
	// 16-bit integer for medium values like battery capacity
	static short batteryMah; 
	// Standard 32-bit integer for general numeric data
	static int serialNumber; 
	// 64-bit large integer for massive global statistics
	static long worldWideUsers; 
	
	// Single-precision decimal for measurements like screen size
	static float screenInches; 
	// Double-precision decimal for high-accuracy weight data
	static double exactWeight; 
	
	// 16-bit Unicode character for single-letter ratings
	static char energyRating; 
	// Logical type representing only true or false states
	static boolean isWaterproof; 
	
	// Reference type used for storing sequences of characters
	static String brandName; 

	public static void main(String[] args) {
		System.out.println("Main started");

		// Assigning values to show how different data types store information
		brandName = "Pixel 8 Pro";
		portCount = 1;
		batteryMah = 5050;
		serialNumber = 987654321;
		worldWideUsers = 5000000000L; // 'L' suffix for long literals
		screenInches = 6.7f;          // 'f' suffix for float literals
		exactWeight = 213.4567;
		energyRating = 'A';
		isWaterproof = true;

		System.out.println("--- Gadget Specifications ---");

		System.out.println("Brand: " + brandName);

		System.out.println("Ports: " + portCount);

		System.out.println("Battery: " + batteryMah + " mAh");

		System.out.println("Serial: " + serialNumber);

		System.out.println("Users: " + worldWideUsers);

		System.out.println("Screen: " + screenInches + " inches");

		System.out.println("Weight: " + exactWeight + " grams");

		System.out.println("Rating: " + energyRating);

		System.out.println("Waterproof: " + isWaterproof);

		System.out.println("Main ended");
	}
}