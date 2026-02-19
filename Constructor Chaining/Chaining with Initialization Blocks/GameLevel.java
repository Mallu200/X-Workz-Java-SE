class GameLevel {
    String levelName;
    int difficulty;

    // Instance Initialization Block
    // Logic: Runs for every level to load shared assets (Music, Physics)
    {
        System.out.println(">> [SYSTEM] Loading Physics Engine...");
        System.out.println(">> [SYSTEM] Pre-loading Sound Sprites...");
        this.difficulty = 1; // Default difficulty floor
    }

    // Constructor 1: Custom level and difficulty
    GameLevel(String name, int diff) {
        this.levelName = name;
        this.difficulty = diff;
        System.out.println("Constructor: Level '" + name + "' built at Difficulty " + diff);
    }

    // Constructor 2: Standard level (Chains to Constructor 1)
    GameLevel(String name) {
        this(name, 1);
        System.out.println("Constructor: Level set with standard difficulty.");
    }

    void start() {
        System.out.println("READY! Starting " + levelName + " [Diff: " + difficulty + "]");
    }

    public static void main(String args[]) {
        System.out.println("--- Booting Level 1 ---");
        GameLevel lv1 = new GameLevel("Veridian Forest");
        lv1.start();

        System.out.println("\n--- Booting Boss Level ---");
        GameLevel boss = new GameLevel("Dragon's Lair", 10);
        boss.start();
    }
}