import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class FileScanner {
    public static void main(String[] args) {
        // Using try-with-resources to close the directory stream
        try (Stream<Path> paths = Files.list(Paths.get("."))) { 
            paths.filter(Files::isRegularFile)
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}