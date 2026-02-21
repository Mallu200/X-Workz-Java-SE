import java.util.HashSet;

class UsernameRegistry {
	public static void main(String[] args) {
		HashSet<String> usernames = new HashSet<>();
		
		usernames.add("java_pro");
		usernames.add("coder_99");
		
		// Attempting to add a duplicate
		boolean isAdded = usernames.add("java_pro");
		
		System.out.println("Was 'java_pro' added again? " + isAdded); // false
        System.out.println("Registered Users: " + usernames);
	}
}