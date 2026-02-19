class Player {
    String username = "ShadowHunter";
    int health = 100;
}

class GameEngine {
    // Parameter 'hero' allows the method to modify the player's life
    static void takeDamage(Player hero) {
        System.out.println("Method takeDamage started");
        
        hero.health -= 20; 
        System.out.println(hero.username + " was hit! Health now: " + hero.health);
        
        System.out.println("Method takeDamage ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Player p1 = new Player();
        takeDamage(p1);
        System.out.println("Main ended");
    }
}