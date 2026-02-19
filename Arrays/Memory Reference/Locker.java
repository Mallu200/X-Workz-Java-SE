class Locker {
    public static void main(String[] args) {
        System.out.println("Main started");

        int[] items = {101, 202, 303};

        // Reference output looks like [I@7ad041f3 ([I means Array of Integers)
        System.out.println("Locker Key ID: " + items);
        
        System.out.println("Item inside: " + items[1]);

        System.out.println("Main ended");
    }
}