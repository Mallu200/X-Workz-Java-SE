package com.xworkz.plan.dto;

import com.xworkz.plan.enums.PlanType;

import java.util.Objects;

public class SubscriptionDTO {
    // Private properties for Encapsulation
    private String email;
    private int durationMonths;
    private PlanType plan; // Using the Enum as a property

    // Default Constructor
    public SubscriptionDTO() {
        // No-arg constructor for framework compatibility
    }

    // Parameterized Constructor
    public SubscriptionDTO(String email, int durationMonths, PlanType plan) {
        this.email = email;
        this.durationMonths = durationMonths;
        this.plan = plan;
    }

    // Standard Getters and Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }

    public PlanType getPlan() { return plan; }
    public void setPlan(PlanType plan) { this.plan = plan; }

    // Standard Object Methods
    @Override
    public String toString() {
        return "SubscriptionDTO [email=" + email + ", durationMonths=" + durationMonths + ", plan=" + plan + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionDTO that = (SubscriptionDTO) o;
        return durationMonths == that.durationMonths && Objects.equals(email, that.email) && plan == that.plan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, durationMonths, plan);
    }
}
