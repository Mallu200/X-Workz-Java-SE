class Calculator<T extends Number> {
    private T value;
    Calculator(T value) { this.value = value; }

    public double getSquare() {
        // We can call .doubleValue() because we know T IS a Number
        return value.doubleValue() * value.doubleValue();
    }
}

public class MathApp {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(5);
        Calculator<Double> doubleCalc = new Calculator<>(2.5);

        System.out.println("Square of 5: " + intCalc.getSquare());
        System.out.println("Square of 2.5: " + doubleCalc.getSquare());

        // Calculator<String> error = new Calculator<>("Hi"); // COMPILER ERROR!
    }
}