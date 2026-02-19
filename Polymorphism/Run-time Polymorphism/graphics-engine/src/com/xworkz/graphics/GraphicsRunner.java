package com.xworkz.graphics;

public class GraphicsRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Polymorphism in action: An array of the Parent type
        Shape[] canvas = new Shape[3];
        canvas[0] = new Circle();
        canvas[1] = new Square();
        canvas[2] = new Circle();

        for (Shape s : canvas) {
            // At runtime, the JVM looks at the actual object (Circle/Square)
            // and calls the correct version of draw()
            s.draw();
            System.out.println("---");
        }

        System.out.println("Main method ended.");
    }
}