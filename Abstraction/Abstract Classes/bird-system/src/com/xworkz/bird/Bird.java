package com.xworkz.bird;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    // Concrete method: Every bird can breathe the same way
    public void breathe() {
        System.out.println(name + " is breathing...");
    }

    // Abstract method: Every bird "flies" differently
    public abstract void fly();
}