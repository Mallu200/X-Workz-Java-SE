package com.project.fvl.dto;

import com.project.fvl.enums.VaultTier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * JSE Topic: Data Transfer Object (DTO) & Serialization
 * Used to carry data from the UI/Scanner to the Service layer.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaultDto implements Serializable {

    // JSE Topic: Serialization ID for version control during File I/O
    private static final long serialVersionUID = 1L;

    private String ownerName;
    private VaultTier tier;
    private String contactNumber;
    private BigDecimal initialDeposit;
    private int durationMonth;

    // Custom SOP to track when data enters the system
    public void traceDto() {
        System.out.println("--> [DTO]: Capturing input for Owner: " + ownerName + " [" + tier + "]");
    }
}