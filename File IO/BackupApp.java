import java.nio.file.*;
import java.io.IOException;

public class BackupApp {
    public static void main(String[] args) {
        Path source = Paths.get("photo.jpg");
        Path destination = Paths.get("backup/photo_copy.jpg");

        try {
            // Copies the file and overwrites if a copy already exists
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backup created!");
        } catch (IOException e) {
            System.err.println("File copy failed.");
        }
    }
}