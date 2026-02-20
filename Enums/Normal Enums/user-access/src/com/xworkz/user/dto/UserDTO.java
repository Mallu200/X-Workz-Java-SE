package com.xworkz.user.dto;

import com.xworkz.user.enums.Role;

import java.util.Objects;

public class UserDTO {
    // Private properties representing user data
    private String userId;
    private String email;
    private Role role; // Using Enum for type-safe role assignment

    // No-arg constructor
    public UserDTO() {
        // Default constructor for framework support
    }

    // Parameterized constructor
    public UserDTO(String userId, String email, Role role) {
        this.userId = userId;
        this.email = email;
        this.role = role;
    }

    // Standard Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    // Overriding toString for clear object logging
    @Override
    public String toString() {
        return "UserDTO [userId=" + userId + ", email=" + email + ", role=" + role + "]";
    }

    // Overriding equals and hashCode for data comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(userId, userDTO.userId) && Objects.equals(email, userDTO.email) && role == userDTO.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, email, role);
    }
}
