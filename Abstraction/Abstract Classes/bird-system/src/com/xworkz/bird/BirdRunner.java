package com.xworkz.bird;

public class BirdRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Abstract reference pointing to Eagle object
        Bird myEagle = new Eagle("Golden Eagle");
        myEagle.breathe();
        myEagle.fly();

        System.out.println("---------------------------");

        // Abstract reference pointing to Penguin object
        Bird myPenguin = new Penguin("Emperor Penguin");
        myPenguin.breathe();
        myPenguin.fly();

        System.out.println("Main method ended.");
    }
}
