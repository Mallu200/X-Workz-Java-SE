public class MathError {
    public static void main(String[] args) {
        try {
            int dividend = 100;
            int divisor = 0; // Logical flaw: division by zero is undefined
            
            // This line will trigger the exception
            int result = dividend / divisor; 
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Citing: Unchecked exceptions indicate situations that cannot be recovered from
            System.err.println("Logic Error: Cannot divide by zero!");
        }
    }
}