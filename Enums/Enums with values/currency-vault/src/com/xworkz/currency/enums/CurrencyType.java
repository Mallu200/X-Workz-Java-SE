package com.xworkz.currency.enums;

// Enum representing different currencies and their conversion rates to INR
public enum CurrencyType {
    USD(83.50),
    EUR(90.20),
    GBP(105.10),
    INR(1.0);

    // Private field to store the exchange rate
    private final double exchangeRate;

    // Private constructor to assign the rate
    CurrencyType(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Getter to retrieve the rate for calculations
    public double getExchangeRate() {
        return exchangeRate;
    }
}
