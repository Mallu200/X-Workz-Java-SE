import java.util.LinkedList;

class BrowserHistory {
	public static void main(String[] args) {
		LinkedList<String> history = new LinkedList<>();
		
		history.add("google.com");
		history.add("github.com");
		history.add("stackoverflow.com");
		
		// LinkedList specific methods: addFirst and addLast
		history.add("homepage.com");
		
		System.out.println("Full History: " + history);
		System.out.println("Current History: " + history.getLast());
	}
}