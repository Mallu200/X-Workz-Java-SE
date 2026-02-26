package com.project.fvl.validation;

import com.project.fvl.dto.VaultDto;
import com.project.fvl.exception.InvalidVaultException;

import java.math.BigDecimal;

/**
 * JSE Topic: Business Logic Validation & String/Math Operations
 * This utility class ensures that only clean data enters the Database.
 */
public class VaultValidator {

    public static void validate(VaultDto dto) throws InvalidVaultException {
        System.out.println("--> [VALIDATOR]: Starting security checks for " + (dto != null ? dto.getOwnerName() : "NULL"));

        // JSE Topic: Null-Safety checks
        if (dto == null || dto.getOwnerName() == null || dto.getTier() == null ||
                dto.getContactNumber() == null || dto.getInitialDeposit() == null) {
            throw new InvalidVaultException("All vault fields are mandatory!");
        }

        // JSE Topic: String manipulation (trim, length)
        if (dto.getOwnerName().trim().isEmpty() || dto.getOwnerName().length() < 3) {
            throw new InvalidVaultException("Owner name must be at least 3 characters long.");
        }

        // JSE Topic: Regex (Regular Expressions) for pattern matching
        if (dto.getContactNumber().length() != 10 || !dto.getContactNumber().matches("\\d+")) {
            throw new InvalidVaultException("Contact must be exactly 10 digits.");
        }

        if (dto.getDurationMonth() < 6 || dto.getDurationMonth() > 120) {
            throw new InvalidVaultException("Vault duration must be between 6 months and 10 years.");
        }

        // JSE Topic: BigDecimal Comparison logic
        BigDecimal minRequired = BigDecimal.valueOf(dto.getTier().getMinBalance());

        if (dto.getInitialDeposit().compareTo(minRequired) < 0) {
            throw new InvalidVaultException("Insufficient Deposit: " + dto.getTier().getLabel() +
                    " tier requires a minimum of " + minRequired);
        }

        System.out.println("--> [VALIDATOR]: PASSED. All business rules satisfied.");
    }
}