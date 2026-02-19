package com.xworkz.employee.dto;

import java.util.Objects;

public class EmployeeDTO {
    // 1. Private Properties
    private int id;
    private String name;
    private String designation;
    private double salary;

    // 2. No-Argument Constructor
    public EmployeeDTO() {
        System.out.println("Invoking No-arg constructor in EmployeeDTO");
    }

    // 3. All-Argument Constructor
    public EmployeeDTO(int id, String name, String designation, double salary) {
        System.out.println("Invoking All-arg constructor in EmployeeDTO");
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // 4. Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // 5. Overriding toString()
    @Override
    public String toString() {
        return "EmployeeDTO [ID=" + id + ", Name=" + name + ", Job=" + designation + ", Salary=" + salary + "]";
    }

    // 6. Overriding hashCode() and equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeDTO other = (EmployeeDTO) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}