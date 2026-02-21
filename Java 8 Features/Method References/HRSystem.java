import java.util.function.Function;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class HRSystem {
    public static void main(String[] args) {
        // Lambda version: name -> new Employee(name)
        // Method Reference: ClassName::new
        Function<String, Employee> creator = Employee::new;

        Employee emp = creator.apply("Alice");
        // Single line comment: Creates a new Employee object with the name 'Alice'
        System.out.println("New Hire Created: " + emp.name);
    }
}