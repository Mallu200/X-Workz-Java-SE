import java.util.*;

public class VarargsUtility {
    @SafeVarargs
    public static <T> void printItems(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        printItems("Java", "Annotations", "Basics");
    }
}