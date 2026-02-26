package com.project.fvl.repository.impl;

import com.project.fvl.enums.VaultTier;
import com.project.fvl.model.Vault;
import com.project.fvl.repository.VaultRepository;
import com.project.fvl.util.DbConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * JSE Topic: JDBC Implementation (CRUD)
 * Handles raw SQL execution and result mapping.
 */
public class VaultRepositoryImpl implements VaultRepository {

    // JSE Topic: Centralized Connection Management using DbConfig utility
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DbConfig.getUrl(),
                DbConfig.getUser(),
                DbConfig.getPass()
        );
    }

    @Override
    public boolean save(Vault vault) {
        System.out.println("--> [REPO]: Executing SQL INSERT for Owner: " + vault.getOwnerName());
        String sql = "INSERT INTO vaults (owner_name, tier, contact, balance, open_date, duration, active) VALUES (?, ?, ?, ?, ?, ?, ?)";

        // JSE Topic: Try-with-resources (Auto-closes Connection and PreparedStatement)
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, vault.getOwnerName());
            ps.setString(2, vault.getTier().name());
            ps.setString(3, vault.getContactNumber());
            ps.setBigDecimal(4, vault.getBalance());
            ps.setDate(5, Date.valueOf(vault.getOpenedDate()));
            ps.setInt(6, vault.getDurationMonth());
            ps.setBoolean(7, vault.isActive());

            int rows = ps.executeUpdate();
            System.out.println("--> [REPO]: Insert successful. Rows affected: " + rows);
            return rows > 0;
        } catch (SQLException e) {
            System.err.println("!! [DATABASE ERROR]: Save failed -> " + e.getMessage());
            return false;
        }
    }

    @Override
    public Optional<Vault> findById(int id) {
        System.out.println("--> [REPO]: Querying DB for Vault ID: " + id);
        String sql = "SELECT * FROM vaults WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return Optional.of(mapResultSetToVault(rs));
            }
        } catch (SQLException e) {
            System.err.println("!! [DATABASE ERROR]: FindById failed.");
        }
        return Optional.empty();
    }


    @Override
    public List<Vault> findAll() {
        System.out.println("--> [REPO]: Fetching all active records from DB...");
        List<Vault> vaults = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // JSE Topic: Manual Resource Management (Traditional Try-Catch-Finally)
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM vaults WHERE active = true");

            while (rs.next()) {
                vaults.add(mapResultSetToVault(rs));
            }
            System.out.println("--> [REPO]: Retrieved " + vaults.size() + " records.");
        } catch (SQLException e) {
            System.err.println("!! [DATABASE ERROR]: FindAll failed.");
        } finally {
            // JSE Topic: Closing resources in finally block to prevent memory leaks
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) { e.printStackTrace(); }
        }
        return vaults;
    }

    @Override
    public boolean update(Vault vault) {
        System.out.println("--> [REPO]: Updating record ID: " + vault.getId());
        String sql = "UPDATE vaults SET owner_name=?, tier=?, contact=?, balance=?, duration=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, vault.getOwnerName());
            pstmt.setString(2, vault.getTier().name());
            pstmt.setString(3, vault.getContactNumber());
            pstmt.setBigDecimal(4, vault.getBalance());
            pstmt.setInt(5, vault.getDurationMonth());
            pstmt.setInt(6, vault.getId());

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("!! [DATABASE ERROR]: Update failed.");
            return false;
        }
    }

    @Override
    public boolean deleteById(int id) {
        System.out.println("--> [REPO]: Soft-deleting record ID: " + id);
        String sql = "UPDATE vaults SET active = false WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("!! [DATABASE ERROR]: Deletion failed.");
            return false;
        }
    }

    /**
     * JSE Topic: Helper Method for Result Set Mapping
     */
    private Vault mapResultSetToVault(ResultSet rs) throws SQLException {
        Vault vault = new Vault();
        vault.setId(rs.getInt("id"));
        vault.setOwnerName(rs.getString("owner_name"));
        vault.setTier(VaultTier.valueOf(rs.getString("tier")));
        vault.setContactNumber(rs.getString("contact"));
        vault.setBalance(rs.getBigDecimal("balance"));
        // JSE Topic: Converting SQL Date to Java 8 LocalDate
        vault.setOpenedDate(rs.getDate("open_date").toLocalDate());
        vault.setActive(rs.getBoolean("active"));
        return vault;
    }
}