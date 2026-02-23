import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileExample {
	public static void main(String[] args) {
		// Attempting to open a file that doesn't exist in the directory
		File file = new File("D:/non_existent_file.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("File opened successfully!");
		} catch (FileNotFoundException e) {
			// Citing: This handles anticipated errors outside program control
			System.err.println("Error: The specified file was not found!");
			e.printStackTrace();
		}
	}
}