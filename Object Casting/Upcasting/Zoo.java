class Animal {
    void breathe() {
	System.out.println("Animal is breathing..."); }
}

class Lion extends Animal {
    void roar() {
	System.out.println("Lion is roaring!"); }
}

class Zoo {
    public static void main(String[] args) {
        // Upcasting: Lion is treated as a general Animal
        Animal a = new Lion(); 
        a.breathe(); 
        // a.roar(); // ERROR: Animal reference cannot see Lion-specific roar()
    }
}