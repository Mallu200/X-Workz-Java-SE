class LudoGame {
    public static void main(String args[]) {
        System.out.println("Main started");

        // PRE-DEFINED METHOD: Math.random()
        // 1. Math.random() gives a decimal between 0.0 and 0.999...
        // 2. We multiply by 6 to get 0.0 to 5.999...
        // 3. We add 1 to get 1.0 to 6.999...
        // 4. (int) "casts" it, chopping off the decimals to give us 1, 2, 3, 4, 5, or 6.
        int diceRoll = (int)(Math.random() * 6) + 1;
        
        System.out.println("You rolled a: " + diceRoll);

        // LOGIC CHECK: If you roll a 6, you get another turn!
        if (diceRoll == 6) {
            System.out.println("Congratulations! You get an extra turn.");
        }

        System.out.println("Main ended");
    }
}