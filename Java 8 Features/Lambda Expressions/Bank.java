@FunctionalInterface
interface Interest {
    double calculate(double p, double r, int t);
}

class Bank {
    public static void main(String[] args) {
        // Lambda: Uses multiple parameters (p = principal, r = rate, t = time)
        Interest simpleInterest = (p, r, t) -> (p * r * t) / 100;

        // Single line comment: Calculates interest for $1000 at 5% for 2 years
        System.out.println("Interest Earned: $" + simpleInterest.calculate(1000, 5, 2));
    }
}