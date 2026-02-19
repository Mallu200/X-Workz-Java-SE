class GameCharacter {
    // float is the standard for 3D engine physics
    static float getMovementSpeed() {
        // Logic: Returns speed units per second
        return 5.5f;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        float speed = getMovementSpeed();
        System.out.println("Character Speed: " + speed + " units/sec");
        System.out.println("Main ended");
    }
}