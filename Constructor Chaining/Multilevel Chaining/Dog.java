class LivingBeing {
    LivingBeing() {
        System.out.println("Step 1: Biological systems activated (Grandparent)");
    }
}

class Animal extends LivingBeing {
    String species;

    Animal(String species) {
        // Implicitly calls super() for LivingBeing
        this.species = species;
        System.out.println("Step 2: Animal category set to: " + species + " (Parent)");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species); // Calls Animal(String)
        this.breed = breed;
        System.out.println("Step 3: Dog breed set to: " + breed + " (Child)");
    }

    void bark() {
        System.out.println(breed + " says: Woof Woof!");
    }

    public static void main(String args[]) {
        System.out.println("--- Creating a New Pet ---");
        Dog myPet = new Dog("Mammal", "German Shepherd");
        
        System.out.println("--------------------------");
        myPet.bark();
    }
}