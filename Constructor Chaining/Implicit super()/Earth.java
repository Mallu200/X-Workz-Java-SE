// No 'extends' here, but Java secretly adds 'extends Object'
class Universe {
    Universe() {
        // Java secretly adds super(); here to call Object()
        System.out.println("Step 1: The Universe (Grandparent) is born.");
    }
}

class Galaxy extends Universe {
    Galaxy() {
        // Secretly calls super() -> Universe()
        System.out.println("Step 2: The Galaxy (Parent) forms.");
    }
}

class Earth extends Galaxy {
    Earth() {
        // Secretly calls super() -> Galaxy()
        System.out.println("Step 3: Earth (Child) is initialized.");
    }

    public static void main(String args[]) {
        System.out.println("--- Genesis: Starting the Universal Chain ---");
        Earth home = new Earth();
        
        // Proof that Object class is the parent:
        // Every object has the .hashCode() method from Object class
        System.out.println("----------------------------------------------");
        System.out.println("Object HashCode (from java.lang.Object): " + home.hashCode());
    }
}