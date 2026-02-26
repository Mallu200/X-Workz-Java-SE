package com.project.fvl.model;

import com.project.fvl.enums.VaultTier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * JSE Topic: Persistence Model & Serialization
 * Represents the 'Vaults' table structure in the database.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vault implements Serializable {

    // JSE Topic: serialVersionUID for consistent Object I/O
    private static final long serialVersionUID = 2L;

    private int id;                 // Primary Key (Auto-increment in DB)
    private String ownerName;
    private VaultTier tier;
    private String contactNumber;
    private BigDecimal balance;
    private LocalDate openedDate;   // JSE Topic: java.time API
    private int durationMonth;
    private boolean isActive;

    /**
     * SOP to trace Model state during Repository operations
     */
    public void logModelState() {
        System.out.println("--> [MODEL]: Processing Vault Record [ID: " + id + ", Owner: " + ownerName + "]");
    }
}