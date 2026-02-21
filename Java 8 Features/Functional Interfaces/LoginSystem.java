@FunctionalInterface
interface Authenticator {
    boolean verify(String input); // Single abstract method for checking
}

class LoginSystem {
    public static void main(String[] args) {
        // Lambda checks if password length is at least 8 characters
        Authenticator securePass = (pass) -> pass.length() >= 8;

        System.out.println("Is '123' secure? " + securePass.verify("123")); // Prints false
    }
}