class SearchEngine {
	public static void main(String[] args) {
		String userInput = "iPHONE 15";
		String databaseItem = "iphone 15";
		
		// Convert input to lowercase so it matches the databaseItem
		String cleanInput = userInput.toLowerCase();
		
		System.out.println("Search Match: " + cleanInput.equals(databaseItem));
	}
}