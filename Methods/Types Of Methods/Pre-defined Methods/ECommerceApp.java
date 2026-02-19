import java.util.Arrays; // Required to use the Arrays utility class

class ECommerceApp {
    public static void main(String args[]) {
        System.out.println("Main started");

        int[] prices = {1200, 450, 3000, 800, 150};

        // PRE-DEFINED METHOD: Arrays.sort(array)
        // This modifies the original array directly.
        // It arranges elements in ascending (natural) order.
        Arrays.sort(prices);

        System.out.println("Prices sorted (Low to High):");
        for (int p : prices) {
            // Using the Rupee symbol for context
            System.out.println("₹" + p);
        }

        System.out.println("Main ended");
    }
}