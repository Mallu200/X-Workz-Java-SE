import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class FileMetadata {
    public static void main(String[] args) {
        Path path = Paths.get("app.log");
        try {
            // Fetches all basic attributes (size, creation time, etc.) in one go
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("Creation Time: " + attr.creationTime());
            System.out.println("Is Directory: " + attr.isDirectory());
            System.out.println("Size: " + attr.size() + " bytes");
        } catch (IOException e) {
            System.err.println("File not found!");
        }
    }
}