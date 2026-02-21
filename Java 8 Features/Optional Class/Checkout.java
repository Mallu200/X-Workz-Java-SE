import java.util.Optional;

class Checkout {
    public static void main(String[] args) {
        Optional<String> coupon = Optional.empty(); // No coupon applied

        // Runs the print logic ONLY if a coupon exists
        coupon.ifPresent(c -> System.out.println("Applying code: " + c));

        // Logic to show a message if empty
        System.out.println("Final Price: " + (coupon.isPresent() ? "Discounted" : "Original"));
    }
}