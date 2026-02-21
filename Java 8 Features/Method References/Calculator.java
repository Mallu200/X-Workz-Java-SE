import java.util.function.Function;

class Calculator {
    public static void main(String[] args) {
        // Lambda version: n -> Math.sqrt(n)
        // Method Reference: Math class static method
        Function<Double, Double> sqrtFinder = Math::sqrt;

        // Single line comment: Calculates square root of 64.0 to get 8.0
        System.out.println("Square Root: " + sqrtFinder.apply(64.0));
    }
}