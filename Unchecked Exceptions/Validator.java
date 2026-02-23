public class Validator {
    public static void setAge(int age) {
        if (age < 0) {
            // Manually throwing an unchecked exception for bad input
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        System.out.println("Age set to: " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(-5); // Passing an inappropriate argument
        } catch (IllegalArgumentException e) {
            // Citing: Used when an illegal argument is passed to a method
            System.err.println("Validation Error: " + e.getMessage());
        }
    }
}