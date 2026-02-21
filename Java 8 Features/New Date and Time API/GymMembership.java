import java.time.LocalDate;

class GymMembership {
    public static void main(String[] args) {
        LocalDate expiryDate = LocalDate.of(2026, 01, 01);
        LocalDate today = LocalDate.now();

        // isBefore() is a simple, readable way to compare dates
        boolean isExpired = expiryDate.isBefore(today);

        // Single line comment: Checks if the expiry date has passed today's date
        System.out.println("Is membership expired? " + isExpired);
    }
}