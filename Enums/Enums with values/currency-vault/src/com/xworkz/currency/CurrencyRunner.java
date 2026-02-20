package com.xworkz.currency;

import com.xworkz.currency.dto.WalletDTO;
import com.xworkz.currency.enums.CurrencyType;

public class CurrencyRunner {

    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Creating a Wallet DTO with USD currency
        WalletDTO myWallet = new WalletDTO("Sudeep", 100.0, CurrencyType.USD);

        // Printing basic data
        System.out.println("Invoking getUserName: " + myWallet.getUserName());
        System.out.println("Invoking getBalance: " + myWallet.getBalance() + " " + myWallet.getCurrency());

        // Performing calculation using the value stored in the Enum
        double rate = myWallet.getCurrency().getExchangeRate();
        double balanceInINR = myWallet.getBalance() * rate;

        System.out.println("Current Exchange Rate for " + myWallet.getCurrency() + ": " + rate);
        System.out.println("Equivalent Balance in INR: ₹" + balanceInINR);

        // Printing full DTO state
        System.out.println("Full Wallet Info: " + myWallet.toString());

        System.out.println("Main method ended.");
    }
}