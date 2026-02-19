package com.xworkz.graphics;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Invoking draw in Square");
        System.out.println(">> Calculating 4 equal sides and 90-degree angles. Drawing Square.");
    }
}