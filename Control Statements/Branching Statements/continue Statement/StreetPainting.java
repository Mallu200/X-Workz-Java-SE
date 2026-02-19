class StreetPainting {
    public static void main(String args[]) {
        System.out.println("Main started");

        // FOR LOOP: Walking down a street of 6 houses
        for (int house = 1; house <= 6; house++) {
            
            // LOGIC CHECK: Is the house number even?
            if (house % 2 == 0) {
                // THE CONTINUE STATEMENT:
                // If it's house 2, 4, or 6, Java hits 'continue'.
                // It immediately jumps back to 'house++' and skips the print line.
                continue; 
            }
            
            // This line only runs for ODD houses (1, 3, 5)
            System.out.println("Painting House Number: " + house);
        }

        System.out.println("Main ended");
    }
}