package com.xworkz.currency.dto;

import com.xworkz.currency.enums.CurrencyType;

import java.util.Objects;

public class WalletDTO {
    private String userName;
    private double balance;
    private CurrencyType currency; // Advanced Enum property

    public WalletDTO() {}

    public WalletDTO(String userName, double balance, CurrencyType currency) {
        this.userName = userName;
        this.balance = balance;
        this.currency = currency;
    }

    // Standard Getters and Setters
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public CurrencyType getCurrency() { return currency; }
    public void setCurrency(CurrencyType currency) { this.currency = currency; }

    @Override
    public String toString() {
        return "WalletDTO [userName=" + userName + ", balance=" + balance + ", currency=" + currency + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletDTO walletDTO = (WalletDTO) o;
        return Double.compare(walletDTO.balance, balance) == 0 &&
                Objects.equals(userName, walletDTO.userName) &&
                currency == walletDTO.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, balance, currency);
    }
}
