import java.util.Optional;

class CompanyDB {
    public static void main(String[] args) {
        // Simulated database lookup returning Optional
        Optional<String> employee = findEmployee(999);

        // Throws a custom exception if employee is not found
        String name = employee.orElseThrow(() -> new RuntimeException("Employee Missing!"));
        
        System.out.println("Found: " + name);
    }

    static Optional<String> findEmployee(int id) {
        return Optional.empty(); // Simulating "Not Found" in DB
    }
}