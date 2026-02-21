@FunctionalInterface
interface PowerUp {
    int multiply(int baseDamage);
}

class GameEngine {
    public static void main(String[] args) {
        // Lambda: Triples the input value
        PowerUp tripleDamage = damage -> damage * 3;

        // Single line comment: Multiplies base damage 50 by 3 to get 150
        System.out.println("Critical Hit Damage: " + tripleDamage.multiply(50));
    }
}