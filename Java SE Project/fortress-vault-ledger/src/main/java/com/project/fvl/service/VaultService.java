package com.project.fvl.service;

import com.project.fvl.dto.VaultDto;
import com.project.fvl.exception.InvalidVaultException;

import java.util.List;

/**
 * JSE Topic: Abstraction & Loose Coupling
 * This interface defines the 'what' of our business logic,
 * separating the requirement from the implementation.
 */
public interface VaultService {

    /**
     * JSE Topic: Exception Propagation
     * Declares that this method might throw a checked exception
     * which must be handled by the Runner (Controller).
     */
    boolean openVault(VaultDto vaultDto) throws InvalidVaultException;

    VaultDto getVaultById(int id);

    // JSE Topic: Collections Framework
    List<VaultDto> getAllVaults();

    boolean updateVault(int id, VaultDto vaultDto) throws InvalidVaultException;

    /**
     * Represents a logical delete (Soft Delete) in our system.
     */
    boolean closeVault(int id);
}