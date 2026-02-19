class Enemy {
    // STATE: Each enemy starts with a fresh 100 HP
    int health = 100;

    // INSTANCE METHOD: Modifies the health of the specific enemy being hit
    void hit(int damage) {
        // Logic: Subtract damage from this specific object's health
        health -= damage;
        
        System.out.println("Ouch! Enemy took " + damage + " damage.");
        System.out.println("Enemy Current Health: " + health);

        // EXTRA LOGIC: Checking for defeat
        if (health <= 0) {
            System.out.println("Enemy defeated!");
        }
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // CREATING TWO SEPARATE ENEMIES
        Enemy zombie1 = new Enemy();
        Enemy zombie2 = new Enemy();

        // SCENARIO: Player attacks the first zombie
        System.out.println("--- Attacking Zombie 1 ---");
        zombie1.hit(20); 

        // PROOF OF INDEPENDENCE:
        // zombie1.health is now 80, but zombie2.health is still 100!
        System.out.println("--- Checking Zombie 2 Status ---");
        System.out.println("Zombie 2 Health: " + zombie2.health);

        System.out.println("Main ended");
    }
}