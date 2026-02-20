package com.xworkz.home.dto;

import com.xworkz.home.enums.DeviceType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data                // Magic annotation: provides Getters, Setters, toString, Equals, and HashCode
@NoArgsConstructor   // Necessary for creating empty objects
@AllArgsConstructor  // Necessary for passing all values in one line
public class SmartDeviceDTO {
    private String deviceId;
    private String modelName;
    private DeviceType type;
    private boolean isOnline;
    private double powerConsumption;
}
