package com.project.fvl.exception;

/**
 * JSE Topic: Custom Checked Exceptions
 * This class allows us to handle business-specific validation errors
 * and forces the caller to use try-catch blocks.
 */
public class InvalidVaultException extends Exception {

    // JSE Topic: Serialization (Exceptions inherit Serializable from Throwable)
    private static final long serialVersionUID = 1L;

    public InvalidVaultException(String message) {
        super(message);
        // SOP for real-time debugging when an error is triggered
        System.err.println("!! [EXCEPTION]: Validation Failed -> " + message);
    }
}