import java.util.*;
import java.util.stream.*;

class BrowserSearch {
    public static void main(String[] args) {
        List<String> links = Arrays.asList("http://test.com", "https://google.com", "https://java.com");

        // findFirst() returns an Optional (which we learned in Phase 5!)
        Optional<String> secureLink = links.stream()
                                           .filter(link -> link.startsWith("https"))
                                           .findFirst();

        // Single line comment: Finds the first secure link and provides a fallback if none found
        System.out.println("Safe link to open: " + secureLink.orElse("No secure link found"));
    }
}