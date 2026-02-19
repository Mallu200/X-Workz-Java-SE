class Monster {
    // short is used for HP values in many RPG games
    static short getBossHealth() {
        // Logic: Returns the health points of the level boss
        return 25000;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        short hp = getBossHealth();
        System.out.println("Boss HP Remaining: " + hp);
        System.out.println("Main ended");
    }
}