import java.util.Optional;

class ProfileApp {
	public static void main(String[] args) {
		String userNickname = null; // Simulated missing data
		
		// Wrapping the null value safely
		Optional<String> opt = Optional.ofNullable(userNickname);
		
		// Returns 'Guest' if nickname is null
		System.out.println("Display Name: " + opt.orElse("Guest"));
	}
}