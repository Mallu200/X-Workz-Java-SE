import java.nio.file.*;
import java.io.IOException;

public class TempFileApp {
    public static void main(String[] args) {
        try {
            // Creates a file in the OS default temp folder
            Path tempFile = Files.createTempFile("report_", ".tmp");
            System.out.println("Temp file created at: " + tempFile);

            // Tells the JVM to delete this file when the program exits
            tempFile.toFile().deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}