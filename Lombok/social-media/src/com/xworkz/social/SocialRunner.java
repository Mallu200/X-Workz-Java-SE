package com.xworkz.social;

import com.xworkz.social.dto.ProfileDTO;
import com.xworkz.social.enums.AccountType;

public class SocialRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Using @Builder to create a profile - very clean for many fields
        ProfileDTO myProfile = ProfileDTO.builder()
                .username("java_pro_2024")
                .bio("Building clean code with Lombok")
                .followerCount(5000)
                .followingCount(250)
                .accountType(AccountType.CREATOR)
                .isPrivate(false)
                .build();

        // Accessing data using Getters provided by @Data
        System.out.println("Invoking getUsername: " + myProfile.getUsername());
        System.out.println("Account Type: " + myProfile.getAccountType());

        // Printing the full state via @Data's toString
        System.out.println("Profile Summary: " + myProfile.toString());

        // Updating follower count using generated Setter
        myProfile.setFollowerCount(5001);
        System.out.println("Updated Followers: " + myProfile.getFollowerCount());

        System.out.println("Main method ended.");
    }
}