import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

class DataCleaner {
    public static void main(String[] args) {
        ArrayList<String> tags = new ArrayList<>(Arrays.asList("Java", "OOPS", "Java", "Collections"));

        // Converting List to HashSet to remove duplicates
        HashSet<String> uniqueTags = new HashSet<>(tags);

        System.out.println("Original Tags: " + tags);
        System.out.println("Cleaned Tags: " + uniqueTags);
    }
}