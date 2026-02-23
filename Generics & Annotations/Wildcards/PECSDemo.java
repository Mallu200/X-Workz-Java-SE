import java.util.*;

public class PECSDemo {
    public static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number n : source) {
            destination.add(n); // Reading from source, writing to destination
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Object> objs = new ArrayList<>();
        copy(ints, objs);
        System.out.println("Copied list: " + objs);
    }
}