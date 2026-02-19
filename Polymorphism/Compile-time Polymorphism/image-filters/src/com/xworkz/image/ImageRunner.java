package com.xworkz.image;

public class ImageRunner {
    public static void main(String[] args) {
        FilterService editor = new FilterService();

        System.out.println("--- Action 1: One Tap Edit ---");
        editor.apply("Vintage");

        System.out.println("\n--- Action 2: Fine Tuning ---");
        editor.apply("Sepia", 45);

        System.out.println("\n--- Action 3: Professional Customization ---");
        editor.apply(255, 128, 0); // Pure Orange filter
    }
}