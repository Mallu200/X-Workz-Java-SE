class CoffeeMachine {
	public static void main(String[] args) {
		System.out.println("Main started");

		int waterAmount = 500; // 500ml - Initial Resource
		
		// WHILE LOOP: Entry-Controlled
		// It checks if there is enough water (100ml) BEFORE brewing.
		// If water was 50ml, the loop would never run even once.
		while (waterAmount >= 100) {
			System.out.println("Brewing coffee... Water left: " + waterAmount + "ml");
			
			// DECREMENT: Reducing the resource after each successful operation
			waterAmount -= 100; 
		}
		
		System.out.println("Please refill the water tank.");

		System.out.println("Main ended");
	}
}