package com.xworkz.employee.dto;

import com.xworkz.employee.enums.Role;

import lombok.*; // Importing Lombok annotations

@Getter              // Generates all Getters
@Setter              // Generates all Setters
@NoArgsConstructor   // Generates Default Constructor
@AllArgsConstructor  // Generates Parameterized Constructor
@ToString            // Generates toString()
@EqualsAndHashCode   // Generates equals() and hashCode()

public class EmployeeDTO {
    private int id;
    private String name;
    private Role role;
}
