import java.util.*;
import java.util.stream.*;

class Employee {
    String name; int id;
    Employee(int id, String name) { this.id = id; this.name = name; }
    String getName() { return name; }
}

class HRReport {
    public static void main(String[] args) {
        List<Employee> staff = Arrays.asList(new Employee(1, "Alice"), new Employee(2, "Bob"));

        // Use map to transform Employee objects into Strings
        List<String> names = staff.stream()
                                  .map(Employee::getName)
                                  .collect(Collectors.toList());

        // Single line comment: Converts the list of employees into a list of names
        System.out.println("Staff Names: " + names);
    }
}