public class NullRefExample {
    public static void main(String[] args) {
        try {
            String text = null; // Reference exists, but points to nothing
            
            // Attempting to call a method on a null reference
            int length = text.length(); 
            System.out.println("Length: " + length);
            
        } catch (NullPointerException e) {
            // Citing: Results from flaws like null references
            System.err.println("Error: Attempted to access a method on a null object!");
        }
    }
}