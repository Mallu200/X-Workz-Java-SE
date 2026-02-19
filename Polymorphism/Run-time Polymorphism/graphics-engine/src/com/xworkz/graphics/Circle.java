package com.xworkz.graphics;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Invoking draw in Circle");
        System.out.println(">> Calculating circumference... Drawing a 360-degree curve.");
    }
}
