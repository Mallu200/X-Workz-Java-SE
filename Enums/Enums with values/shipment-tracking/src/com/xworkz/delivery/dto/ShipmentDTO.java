package com.xworkz.delivery.dto;

import com.xworkz.delivery.enums.Status;

import java.util.Objects;

public class ShipmentDTO {
    private String trackingId;
    private Status status; // Enum property

    public ShipmentDTO() {}

    public ShipmentDTO(String trackingId, Status status) {
        this.trackingId = trackingId;
        this.status = status;
    }

    // Getters and Setters
    public String getTrackingId() { return trackingId; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return "ShipmentDTO [trackingId=" + trackingId + ", status=" + status + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentDTO that = (ShipmentDTO) o;
        return Objects.equals(trackingId, that.trackingId) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackingId, status);
    }
}
