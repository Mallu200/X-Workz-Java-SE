package com.xworkz.office;

public class OfficeRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in OfficeRunner");

        SmartPrinter hpOfficeJet = new SmartPrinter();

        System.out.println("Project: Smart Printer Multiple Inheritance");
        System.out.println("-------------------------------------------");

        // 1. Using Printer behavior
        hpOfficeJet.printDocument();

        // 2. Using Scanner behavior
        hpOfficeJet.scanDocument();

        System.out.println("Main method ended successfully");
    }
}