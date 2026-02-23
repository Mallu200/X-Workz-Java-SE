import java.util.*;

abstract class Employee {
    abstract double getSalary();
}

class FullTime extends Employee {
    double getSalary() { return 5000.0; }
}

public class PayrollSystem {
    // This allows List<FullTime>, List<PartTime>, or List<Employee>
    public static void processSalaries(List<? extends Employee> employees) {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        System.out.println("Total Payroll: $" + total);
    }

    public static void main(String[] args) {
        List<FullTime> staff = Arrays.asList(new FullTime(), new FullTime());
        processSalaries(staff); // Works perfectly!
    }
}