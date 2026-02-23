import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ConfigApp {
	public static void main(String[] args) {
		Path path = Paths.get("settings.txt");
		
		try {
			// Reads all lines into a List of Strings
			List<String> lines = Files.readAllLines(path);
			lines.forEach(line -> System.out.println("Config: " + line));
		} catch (IOException e) {
			System.out.println("Could not find settings.txt");
		}
	}
}