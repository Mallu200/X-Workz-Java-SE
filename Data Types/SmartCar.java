class SmartCar {
	
	// Reference type used for storing the vehicle's name
	static String modelName; 
	// 8-bit integer for small values like the number of gears
	static byte gearCount; 
	// 16-bit integer for medium values like maximum velocity
	static short topSpeed; 
	// 32-bit standard integer for currency and price values
	static int price; 
	// 64-bit long integer for unique, high-digit identification numbers
	static long chassisNumber; 
	// Single-precision decimal for tracking liquid fuel percentages
	static float fuelLevel; 
	// Double-precision decimal for sensitive electrical measurements
	static double batteryVoltage; 
	// 16-bit Unicode character for fuel efficiency classification
	static char ecoRating; 
	// Logical type for binary states like power source type
	static boolean isElectric; 

	public static void main(String[] args) {
		System.out.println("Main started");

		// Assigning values to all static variables
		modelName = "Tesla Model S";
		gearCount = 1;
		topSpeed = 250;
		price = 7500000;
		chassisNumber = 5748392011223344L; // Requires 'L' suffix for long
		fuelLevel = 0.0f;                   // Requires 'f' suffix for float
		batteryVoltage = 375.50;
		ecoRating = 'A';
		isElectric = true;

		System.out.println("Model: " + modelName);

		System.out.println("Gears: " + gearCount);

		System.out.println("Top Speed: " + topSpeed + " km/h");

		System.out.println("Price: " + "₹" + price);

		System.out.println("Chassis Number: " + chassisNumber);

		System.out.println("Fuel Level: " + fuelLevel + "%");

		System.out.println("Battery: " + batteryVoltage + "V");

		System.out.println("Eco Rating: " + ecoRating);

		System.out.println("Is Electric?: " + isElectric);

		System.out.println("Main ended");
	}
}