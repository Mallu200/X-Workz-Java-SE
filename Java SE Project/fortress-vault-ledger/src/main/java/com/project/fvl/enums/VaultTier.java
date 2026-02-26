package com.project.fvl.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * JSE Topic: Enums with Fields and Constructors
 * This ensures type-safety across the entire application.
 */
@Getter
@RequiredArgsConstructor
public enum VaultTier {
    // Defining fixed constants with their respective minimum balance requirements
    SILVER("Silver", 5000),
    GOLD("Gold", 25000),
    PLATINUM("Platinum", 100000);

    private final String label;
    private final double minBalance;

    // Static block to show when the Enum class is loaded into memory (JSE Topic: Static Initializers)
    static {
        System.out.println("--> [System]: VaultTier Enum constants initialized.");
    }
}