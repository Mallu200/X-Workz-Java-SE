package com.xworkz.office;

// SmartPrinter 'Is-A' Printer AND 'Is-A' Scanner
public class SmartPrinter implements Printer, Scanner {

    @Override
    public void printDocument() {
        System.out.println("Invoking printDocument in SmartPrinter"); // Mandatory SOP
        System.out.println(">> [PRINT] Inkjet nozzles active. Page 1 of 5 printed.");
    }

    @Override
    public void scanDocument() {
        System.out.println("Invoking scanDocument in SmartPrinter"); // Mandatory SOP
        System.out.println(">> [SCAN] Optical sensor active. Saving document as PDF.");
    }
}