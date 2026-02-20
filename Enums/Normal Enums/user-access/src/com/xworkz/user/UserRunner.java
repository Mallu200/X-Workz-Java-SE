package com.xworkz.user;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.enums.Role;

public class UserRunner {

    public static void main(String[] args) {
        // Mandatory Start SOP
        System.out.println("Main method started...");

        // Creating a User DTO and assigning the ADMIN role from the Enum
        UserDTO user = new UserDTO("EMP_001", "admin@xworkz.com", Role.ADMIN);

        // Accessing values using Getters with mandatory SOPs
        System.out.println("Invoking getUserId: " + user.getUserId());
        System.out.println("Invoking getEmail: " + user.getEmail());
        System.out.println("Invoking getRole: " + user.getRole());

        // Printing the full state of the user object
        System.out.println("User Profile: " + user.toString());

        // Changing role to GUEST to simulate a permission downgrade
        user.setRole(Role.GUEST);
        System.out.println("Updated Role: " + user.getRole());

        System.out.println("Main method ended.");
    }
}
