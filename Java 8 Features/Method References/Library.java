import java.util.Arrays;
import java.util.List;

class Library {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("Java Basics", "Spring Boot", "Microservices");

        // Lambda version: book -> System.out.println(book)
        // Method Reference: instance::methodName
        books.forEach(System.out::println); 

        // Single line comment: Iterates through the list and prints each book
    }
}