package com.xworkz.image;

public class FilterService {

    // 1. Basic Filter: Just the name
    public void apply(String filterName) {
        System.out.println("Invoking apply with Filter Name");
        System.out.println(">> Applying '" + filterName + "' at 100% intensity.");
    }

    // 2. Filter with Intensity: Name and a percentage
    public void apply(String filterName, int intensity) {
        System.out.println("Invoking apply with Intensity");
        System.out.println(">> Applying '" + filterName + "' at " + intensity + "% strength.");
    }

    // 3. Custom Color Filter: Using RGB values (Different number and types)
    public void apply(int red, int green, int blue) {
        System.out.println("Invoking apply with RGB values");
        System.out.println(">> Creating custom color filter using R:" + red + " G:" + green + " B:" + blue);
    }
}