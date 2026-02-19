class Greenhouse {

	// Reference type (Object) for the name of the plant
	static String plantSpecies;
	// 8-bit integer used for counting small units like leaves
	static byte leafCount;
	// 32-bit standard integer for counting seeds in bulk
	static int totalSeeds;
	// 64-bit large integer for high-volume microbial counts
	static long soilMicrobes;
	// Single-precision decimal for environmental humidity readings
	static float humidity;
	// Double-precision decimal for highly precise gas measurements
	static double co2Level;
	// 16-bit Unicode character for quality or health classification
	static char healthGrade;
	// Boolean flag representing the binary state of the irrigation system
	static boolean irrigationOn;
	// 16-bit integer for measuring light intensity levels
	static short lightIntensity;

	public static void main(String agri[]) 
	{
		System.out.println("Main started");

		// Assigning values to all variables to demonstrate data storage
		plantSpecies = "Monstera Deliciosa";
		leafCount = 12;
		totalSeeds = 500;
		soilMicrobes = 9000000000L; // Large number requires 'L' suffix
		humidity = 75.8f;           // Float requires 'f' suffix
		co2Level = 415.25;
		healthGrade = 'A';
		irrigationOn = true;
		lightIntensity = 1500;

		System.out.println("Plant: " + plantSpecies);
		
		System.out.println("Leaf Count: " + leafCount);
		
		System.out.println("Total Seeds: " + totalSeeds);
		
		System.out.println("Soil Microbes: " + soilMicrobes);
		
		System.out.println("Humidity: " + humidity + "%");
		
		System.out.println("CO2 Level: " + co2Level + " ppm");
		
		System.out.println("Grade: " + healthGrade);
		
		System.out.println("Watering: " + irrigationOn);
		
		System.out.println("Light Intensity: " + lightIntensity + " Lux");

		System.out.println("Main ended");
	}
}