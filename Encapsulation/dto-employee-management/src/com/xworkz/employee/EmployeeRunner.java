package com.xworkz.employee;

import com.xworkz.employee.dto.EmployeeDTO;

public class EmployeeRunner {
    public static void main(String[] args) {
        System.out.println("Main started...");

        // Using All-arg constructor
        EmployeeDTO emp1 = new EmployeeDTO(101, "Suresh", "Developer", 45000.0);

        // Using No-arg constructor + Setters
        EmployeeDTO emp2 = new EmployeeDTO();
        emp2.setId(102);
        emp2.setName("Ramesh");

        // Printing using toString()
        System.out.println("Employee 1 Data: " + emp1);
        System.out.println("Employee 2 Data: " + emp2);

        // Comparison using equals()
        System.out.println("Is emp1 same as emp2? " + emp1.equals(emp2));

        System.out.println("Main ended.");
    }
}