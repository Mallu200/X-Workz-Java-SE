class GameCharacter {
	public static void main(String[] args) {
		System.out.println("Main started");

		int health = 100;
		int damagePerHit = 20;
		
		System.out.println("--- Battle Started! ---");
		
		// WHILE LOOP: Survival Logic
		// The condition 'health > 0' is checked before every attack.
		// If the character starts with 0 health, the battle never happens.
		while (health > 0) {
			System.out.println("Player is fighting... Current Health: " + health + "%");
			
			// UPDATE: Reducing health. This brings the character closer 
			// to the 'Game Over' condition.
			health = health - damagePerHit;
		}
		
		System.out.println("Health is 0%. Game Over!");

		System.out.println("Main ended");
	}
}