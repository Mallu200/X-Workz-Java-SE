@FunctionalInterface
interface EmailFormat {
    String create(String username);
}

class CompanyPortal {
    public static void main(String[] args) {
        // Lambda: Transforms a name into a full corporate email
        EmailFormat corporate = name -> name.toLowerCase() + "@company.com";

        // Single line comment: Converts 'John' to 'john@company.com'
        System.out.println("Generated Email: " + corporate.create("John"));
    }
}