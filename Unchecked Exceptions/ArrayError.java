public class ArrayError {
    public static void main(String[] args) {
        try {
            int[] scores = {95, 88, 72}; // Valid indices are 0, 1, 2
            
            // Attempting to access index 5
            System.out.println("Score: " + scores[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Citing: Occurs when accessing an invalid array index
            System.err.println("Error: You tried to access an index that doesn't exist!");
            System.err.println("Message: " + e.getMessage());
        }
    }
}