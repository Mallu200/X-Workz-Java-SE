import java.util.HashMap;

class PayrollSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("hr@company.com", 5000);
        salaries.put("dev@company.com", 8000);

        // Removing an employee who left the company
        salaries.remove("hr@company.com");

        System.out.println("Employee List: " + salaries.keySet());
        System.out.println("Total Employees: " + salaries.size());
    }
}