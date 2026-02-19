class PizzaHut {
    public static void main(String args[]) {
        System.out.println("Main started");

        char size = 'M'; // S = Small, M = Medium, L = Large

        // SWITCH: Character Mapping
        // Note: Single quotes ' ' are mandatory for char values.
        switch (size) {
            case 'S':
                System.out.println("Price: ₹199");
                break;
            case 'M':
                // Since size is 'M', the code jumps here.
                System.out.println("Price: ₹399");
                break;
            case 'L':
                System.out.println("Price: ₹599");
                break;
            default:
                // Handles any char that isn't S, M, or L
                System.out.println("Size not available.");
        }

        System.out.println("Main ended");
    }
}