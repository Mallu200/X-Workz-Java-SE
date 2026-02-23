import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlExample {
    public static void main(String[] args) {
        // Wrong URL to trigger a connection error
        String url = "jdbc:mysql://localhost:9999/invalid_db"; 
        
        try {
            Connection conn = DriverManager.getConnection(url, "root", "pass");
        } catch (SQLException e) {
            // Citing: Handling is mandatory for database access errors
            System.err.println("Database Error: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
        }
    }
}