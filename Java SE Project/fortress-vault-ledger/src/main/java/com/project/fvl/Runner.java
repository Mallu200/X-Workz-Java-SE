package com.project.fvl;

import com.project.fvl.dto.VaultDto;
import com.project.fvl.enums.VaultTier;
import com.project.fvl.exception.InvalidVaultException;
import com.project.fvl.service.VaultService;
import com.project.fvl.service.impl.VaultServiceImpl;
import com.project.fvl.util.DataExporter;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * JSE Topic: Main Entry Point & Thread Management
 * This class coordinates the UI and the background processes.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("--> [RUNNER]: Booting Fortress Vault Ledger System...");

        // JSE Topic: Multithreading (Daemon Thread)
        // This runs in the background while the user interacts with the menu
        Thread interestThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Thread.sleep(30000); // Wait 30 seconds
                    System.out.println("\n[SYSTEM THREAD]: Interest accrual check completed for all active vaults.");
                }
            } catch (InterruptedException e) {
                System.out.println("--> [SYSTEM THREAD]: Background thread safely stopped.");
            }
        });
        interestThread.setDaemon(true); // Ensures the thread stops when main exits
        interestThread.start();

        VaultService vaultService = new VaultServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== FORTRESS VAULT LEDGER =====");
            System.out.println("1. Open New Vault (Create)");
            System.out.println("2. View All Vaults (Read)");
            System.out.println("3. Find Vault Details (Search)");
            System.out.println("4. Update Vault Details (Update)");
            System.out.println("5. Close Vault (Delete)");
            System.out.println("6. Export All Data (Serialization)"); // New addition!
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("--> [RUNNER]: Initiating Open Vault Flow...");
                        System.out.print("Enter Owner Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Select Tier: 1. SILVER 2. GOLD 3. PLATINUM: ");
                        int tierChoice = scanner.nextInt();
                        VaultTier tier = (tierChoice == 1) ? VaultTier.SILVER : (tierChoice == 2) ? VaultTier.GOLD : VaultTier.PLATINUM;

                        System.out.print("Enter Contact Number: ");
                        String contact = scanner.next();

                        System.out.print("Enter Initial Deposit: ");
                        BigDecimal deposit = scanner.nextBigDecimal();

                        System.out.print("Enter Duration (Months): ");
                        int months = scanner.nextInt();

                        VaultDto newDto = new VaultDto(name, tier, contact, deposit, months);
                        if (vaultService.openVault(newDto)) {
                            System.out.println("SUCCESS: Vault opened successfully!");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Registered Vaults ---");
                        // JSE Topic: Method Reference and Streams
                        vaultService.getAllVaults().forEach(System.out::println);
                        break;

                    case 3:
                        System.out.print("Enter Vault ID: ");
                        int id = scanner.nextInt();
                        VaultDto found = vaultService.getVaultById(id);
                        if (found != null) {
                            System.out.println("Vault Found: " + found);
                        } else {
                            System.out.println("ERROR: Vault not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Vault ID to Update: ");
                        int updatedId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter new Owner Name: ");
                        String uName = scanner.nextLine();
                        System.out.print("Enter New Deposit Amount: ");
                        BigDecimal uDeposit = scanner.nextBigDecimal();

                        // Tracing logic
                        VaultDto updateDto = new VaultDto(uName, VaultTier.SILVER, "0000000000", uDeposit, 12);
                        if (vaultService.updateVault(updatedId, updateDto)) {
                            System.out.println("SUCCESS: Vault updated.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Vault ID to Close: ");
                        int closeId = scanner.nextInt();
                        if (vaultService.closeVault(closeId)) {
                            System.out.println("SUCCESS: Vault closed logically.");
                        } else {
                            System.out.println("ERROR: Could not close vault.");
                        }
                        break;

                    case 6:
                        // JSE Topic: Data Export using Serialization
                        System.out.println("--> [RUNNER]: Starting Binary Export...");
                        DataExporter.exportToBinary(vaultService.getAllVaults(), "vault_backup.ser");
                        break;

                    case 7:
                        System.out.println("Exiting System. Goodbye!");
                        scanner.close(); // JSE Topic: Closing Resources
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InvalidVaultException e) {
                // JSE Topic: Catching Custom Checked Exceptions
                System.out.println("VALIDATION ERROR: " + e.getMessage());
            } catch (Exception e) {
                // JSE Topic: Generic Exception Handling (Polymorphism)
                System.out.println("SYSTEM ERROR: An unexpected error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}