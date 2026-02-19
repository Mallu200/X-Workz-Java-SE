class Founder {
    // No constructor written, so Java provides a hidden default no-arg constructor
    Founder() {
        System.out.println("Step 1: Founder (Grandparent) logic executed implicitly.");
    }
}

class Company extends Founder {
    // Java automatically inserts 'super();' here even though you don't see it
    Company() {
        System.out.println("Step 2: Company (Parent) logic executed.");
    }
}

class Startup extends Company {
    // Java automatically inserts 'super();' here too
    Startup() {
        System.out.println("Step 3: Startup (Child) logic executed.");
    }

    public static void main(String args[]) {
        System.out.println("--- Starting the Implicit Chain ---");
        new Startup();
    }
}