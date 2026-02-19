class WeatherStation {
	public static void main(String[] args) {
		System.out.println("Main started");

		int[] weeklyTemps = {32, 33, 31, 29, 35, 33, 30};
		
		System.out.println("Degrees recorded this week: ");
		
		// FOR-EACH LOOP: 
		// 'temp' is a local variable created in the Stack memory 
		// It copies the value of each element from the 'weeklyTemps' array one by one
		for (int temp : weeklyTemps) {
			// Accessing the local 'temp' variable directly
			System.out.println(temp + "°C");
		}

		System.out.println("Main ended");
	}
}