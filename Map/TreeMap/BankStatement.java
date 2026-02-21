import java.util.TreeMap;

class BankStatement {
    public static void main(String[] args) {
        // Keys (Dates) will be sorted automatically
        TreeMap<String, String> transactions = new TreeMap<>();

        transactions.put("2024-03-15", "Salary Credit");
        transactions.put("2024-03-01", "Rent Paid");
        transactions.put("2024-03-10", "Groceries");

        // Output: 01, 10, 15 (Perfectly sorted by date)
        System.out.println("Statement: " + transactions);
    }
}