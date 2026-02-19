package com.xworkz.bird;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Invoking fly in Penguin");
        System.out.println(">> Penguins cannot fly in the air; they 'fly' through water at high speeds!");
    }
}
