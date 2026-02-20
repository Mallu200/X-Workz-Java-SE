package com.xworkz.social.dto;

import com.xworkz.social.enums.AccountType;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data                // Generates Getters, Setters, toString, Equals, HashCode
@Builder             // Enables the fluent Builder API
@NoArgsConstructor   // Required for frameworks and manual instantiation
@AllArgsConstructor  // Required by @Builder to function correctly
public class ProfileDTO {
    private String username;
    private String bio;
    private int followerCount;
    private int followingCount;
    private AccountType accountType;
    private boolean isPrivate;
}