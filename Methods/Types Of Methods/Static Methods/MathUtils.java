class MathUtils {
    // STATIC METHOD: getMax
    // It compares three inputs and returns only the largest.
    // This is a "Utility" method because it provides a general service.
    static int getMax(int a, int b, int c) {
        // Log the comparison process
        System.out.println("Comparing: " + a + ", " + b + ", " + c);

        // Logic Path 1: Is 'a' the greatest?
        if (a > b && a > c) return a;
        
        // Logic Path 2: If we reached here, 'a' is not the greatest.
        // We only need to check if 'b' is bigger than 'c'.
        if (b > c) return b;
        
        // Logic Path 3: If neither 'a' nor 'b' won, 'c' must be the greatest.
        return c;
    }

    public static void main(String args[]) {
        System.out.println("Main started");

        // Calling the static method directly
        int topScore = MathUtils.getMax(45, 89, 12);
        
        System.out.println("Highest Score: " + topScore);

        // You can use it for anything—prices, ages, or levels!
        System.out.println("Max Price: ₹" + MathUtils.getMax(1200, 500, 3000));

        System.out.println("Main ended");
    }
}