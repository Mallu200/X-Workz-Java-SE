package com.xworkz.plan;

import com.xworkz.plan.dto.SubscriptionDTO;
import com.xworkz.plan.enums.PlanType;

public class SubscriptionRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Initializing the DTO with a specific Enum constant
        SubscriptionDTO userSub = new SubscriptionDTO("rahul@example.com", 12, PlanType.STANDARD);

        // Printing individual values using Getters
        System.out.println("Invoking getEmail: " + userSub.getEmail());
        System.out.println("Invoking getDurationMonths: " + userSub.getDurationMonths());
        System.out.println("Invoking getPlan: " + userSub.getPlan());

        // Printing the full state of the object
        System.out.println("Full Subscription Data: " + userSub.toString());

        // Upgrading the plan using the Setter and Enum
        userSub.setPlan(PlanType.PREMIUM);
        System.out.println("Updated Plan Tier: " + userSub.getPlan());

        System.out.println("Main method ended.");
    }
}