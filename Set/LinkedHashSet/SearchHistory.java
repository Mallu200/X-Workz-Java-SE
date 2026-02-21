import java.util.LinkedHashSet;

class SearchHistory {
	public static void main(String[] args) {
		LinkedHashSet<String> searches = new LinkedHashSet<>();
		
		searches.add("Java Collections");
        searches.add("Weather today");
        searches.add("Java Collections"); // Duplicate - ignored
        searches.add("Best Pizza nearby");
		
		// Order is preserved: Java -> Weather -> Pizza
        System.out.println("Your recent searches: " + searches);
	}
}