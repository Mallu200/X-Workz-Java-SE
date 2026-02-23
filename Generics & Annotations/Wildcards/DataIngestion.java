import java.util.*;

public class DataIngestion {
    // Accepts List of Integer or any of its superclasses (Number, Object)
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i); // We can safely add Integers here
        }
        System.out.println("Data added: " + list);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(numList);
        addNumbers(objList);
    }
}