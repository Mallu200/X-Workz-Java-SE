import java.util.*;

public class ListAnalyzer {
    // <?> means "a list of some unknown type"
    public static void printListCount(List<?> list) {
        System.out.println("This list has " + list.size() + " elements.");
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        List<Integer> ages = Arrays.asList(25, 30, 35);

        printListCount(names);
        printListCount(ages);
    }
}