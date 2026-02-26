package com.project.fvl.repository;

import com.project.fvl.model.Vault;
import java.util.List;
import java.util.Optional;

/**
 * JSE Topic: Data Access Object (DAO) Pattern
 * This interface abstracts the database operations from the rest of the application.
 */
public interface VaultRepository {

    /**
     * JSE Topic: JDBC Persistence (Create)
     */
    boolean save(Vault vault);

    /**
     * JSE Topic: Java 8 Optional
     * Using Optional prevents NullPointerExceptions when a vault ID doesn't exist.
     */
    Optional<Vault> findById(int id);

    /**
     * JSE Topic: Collections Framework
     * Returns a List of all active records from the database.
     */
    List<Vault> findAll();

    /**
     * JSE Topic: JDBC Persistence (Update)
     */
    boolean update(Vault vault);

    /**
     * JSE Topic: Logical Delete
     * Instead of removing the row, we toggle the 'active' status in the DB.
     */
    boolean deleteById(int id);
}