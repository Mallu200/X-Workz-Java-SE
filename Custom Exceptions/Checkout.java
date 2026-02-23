// Custom Unchecked Exception (extends RuntimeException)
class InvalidDiscountException extends RuntimeException {
    public InvalidDiscountException(String message) {
        super(message);
    }
}

public class Checkout {
    // Unchecked exceptions don't REQUIRE 'throws', but it's good for documentation
    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new InvalidDiscountException("Discount cannot be " + percentage + "%");
        }
        System.out.println("Discount applied successfully!");
    }

    public static void main(String[] args) {
        Checkout cart = new Checkout();
        try {
            cart.applyDiscount(150);
        } catch (InvalidDiscountException e) {
            System.err.println("Coupon Error: " + e.getMessage());
        }
    }
}