import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;

public class LoggerApp {
    public static void main(String[] args) {
        Path logPath = Paths.get("app.log");
        String event = "\nUser 'Admin' logged in at 10:45 AM";

        try {
            // CREATE if missing, APPEND if it exists
            Files.write(logPath, event.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Log updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}