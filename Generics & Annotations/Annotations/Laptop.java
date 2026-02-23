class Machine {
    void start() { System.out.println("Machine starting..."); }
}

public class Laptop extends Machine {
    @Override
    void start() { 
        System.out.println("Laptop booting up..."); 
    }

    // Un-commenting the next line will cause a Compiler Error because 'stort' doesn't exist in Machine
    // @Override void stort() { } 

    public static void main(String[] args) {
        new Laptop().start();
    }
}