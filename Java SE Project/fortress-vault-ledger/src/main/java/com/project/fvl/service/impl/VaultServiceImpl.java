package com.project.fvl.service.impl;

import com.project.fvl.dto.VaultDto;
import com.project.fvl.exception.InvalidVaultException;
import com.project.fvl.model.Vault;
import com.project.fvl.repository.VaultRepository;
import com.project.fvl.repository.impl.VaultRepositoryImpl;
import com.project.fvl.service.VaultService;
import com.project.fvl.validation.VaultValidator;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JSE Topic: Service Layer Implementation
 * Coordinates between Validation, Mapping, and the Repository.
 */
public class VaultServiceImpl implements VaultService {

    private final VaultRepository vaultRepository;

    public VaultServiceImpl() {
        this.vaultRepository = new VaultRepositoryImpl();
    }

    @Override
    public boolean openVault(VaultDto vaultDto) throws InvalidVaultException {
        System.out.println("--> [SERVICE]: Request to open a new vault for: " + vaultDto.getOwnerName());

        // JSE Topic: Method Call & Exception Propagation
        VaultValidator.validate(vaultDto);

        // JSE Topic: Object Mapping
        Vault vault = convertToModel(vaultDto);
        vault.setOpenedDate(LocalDate.now()); // JSE Topic: Java 8 Date API
        vault.setActive(true);

        System.out.println("--> [SERVICE]: Model prepared. Handing over to Repository...");
        return vaultRepository.save(vault);
    }

    @Override
    public VaultDto getVaultById(int id) {
        System.out.println("--> [SERVICE]: Fetching Vault ID: " + id);

        // JSE Topic: Java 8 Optional and Method References
        return vaultRepository.findById(id)
                .map(this::convertToDto)
                .orElse(null);
    }

    @Override
    public List<VaultDto> getAllVaults() {
        System.out.println("--> [SERVICE]: Retrieval request for all active vaults.");

        // JSE Topic: Java 8 Streams API (map and collect)
        return vaultRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateVault(int id, VaultDto vaultDto) throws InvalidVaultException {
        System.out.println("--> [SERVICE]: Updating records for Vault ID: " + id);
        VaultValidator.validate(vaultDto);

        // JSE Topic: Optional isPresent check
        if (vaultRepository.findById(id).isPresent()) {
            Vault vault = convertToModel(vaultDto);
            vault.setId(id);
            return vaultRepository.update(vault);
        }
        return false;
    }

    @Override
    public boolean closeVault(int id) {
        System.out.println("--> [SERVICE]: Initiating closure for Vault ID: " + id);
        return vaultRepository.deleteById(id);
    }

    /**
     * JSE Topic: Manual Object Mapping (DTO to Model)
     */
    private Vault convertToModel(VaultDto dto) {
        Vault vault = new Vault();
        vault.setOwnerName(dto.getOwnerName());
        vault.setTier(dto.getTier());
        vault.setContactNumber(dto.getContactNumber());
        vault.setBalance(dto.getInitialDeposit());
        vault.setDurationMonth(dto.getDurationMonth());
        return vault;
    }

    /**
     * JSE Topic: Manual Object Mapping (Model to DTO)
     */
    private VaultDto convertToDto(Vault model) {
        VaultDto dto = new VaultDto();
        dto.setOwnerName(model.getOwnerName());
        dto.setTier(model.getTier());
        dto.setContactNumber(model.getContactNumber());
        dto.setInitialDeposit(model.getBalance());
        dto.setDurationMonth(model.getDurationMonth());
        return dto;
    }
}