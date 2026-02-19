class Person {
    Person() {
        System.out.println("Step 1: Person (Grandparent) created.");
    }
}

class Employee extends Person {
    String empId;

    // This class HAS NO no-arg constructor.
    // It forces its children to provide an ID.
    Employee(String empId) {
        this.empId = empId;
        System.out.println("Step 2: Employee (Parent) created with ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String id, String dept) {
        // super(); // <--- This would fail! Because Employee() doesn't exist.
        super(id);   // <--- This is MANDATORY.
        this.department = dept;
        System.out.println("Step 3: Manager (Child) created for: " + dept);
    }

    public static void main(String args[]) {
        System.out.println("--- Hiring Process Started ---");
        Manager m = new Manager("EMP-505", "IT");
    }
}