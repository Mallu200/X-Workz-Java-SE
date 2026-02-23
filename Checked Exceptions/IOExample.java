import java.io.FileWriter;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("test.txt");
            writer.write("Hello Java!");
            // Simulating a problem by closing the writer before we are done
            writer.close();
            writer.write("This will fail."); 
        } catch (IOException e) {
            // Citing: IOException typically represents recoverable external errors
            System.err.println("Input/Output error: " + e.getMessage());
        }
    }
}