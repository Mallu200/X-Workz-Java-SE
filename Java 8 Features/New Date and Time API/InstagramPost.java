import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class InstagramPost {
    public static void main(String[] args) {
        LocalDateTime postTime = LocalDateTime.now(); 
        
        // Formatter to make it look nice
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        // Single line comment: Formats the current date and time into a readable string
        System.out.println("Post published on: " + postTime.format(myFormat));
    }
}