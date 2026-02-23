import java.sql.*;

public class BankTransfer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank_db";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            // Step 1: Turn off auto-commit (start the transaction)
            conn.setAutoCommit(false);

            try {
                // Step 2: Deduct from User A
                String deductSql = "UPDATE accounts SET balance = balance - 500 WHERE user_id = 1";
                conn.createStatement().executeUpdate(deductSql);

                // Step 3: Add to User B
                String addSql = "UPDATE accounts SET balance = balance + 500 WHERE user_id = 2";
                conn.createStatement().executeUpdate(addSql);

                // Step 4: If everything is okay, save changes permanently
                conn.commit();
                System.out.println("Transaction successful! Funds moved.");

            } catch (SQLException e) {
                // If any part fails, roll back the whole thing!
                conn.rollback();
                System.err.println("Transaction failed! Money restored to original accounts.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}