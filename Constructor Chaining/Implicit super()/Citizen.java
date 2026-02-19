class Human {
    String species;

    // 1. Parameterized Constructor
    Human(String species) {
        this.species = species;
        System.out.println("Parent: Human initialized as " + species);
    }

    // 2. The "Peacekeeper" (No-Arg Constructor)
    // Adding this allows children to use implicit super() again!
    Human() {
        this.species = "Unknown";
        System.out.println("Parent: Human initialized with Default species.");
    }
}

class Citizen extends Human {
    String country;

    Citizen(String country) {
        // Java automatically inserts 'super();' here. 
        // It points to the No-Arg constructor of Human.
        this.country = country;
        System.out.println("Child: Citizen of " + country + " initialized.");
    }

    public static void main(String args[]) {
        System.out.println("--- Registering Citizen ---");
        Citizen c = new Citizen("India");
        System.out.println("Species: " + c.species + " | Country: " + c.country);
    }
}