import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args) {
		// Syntax: jdbc:mysql://[host]:[port]/[database_name]
		String url = "jdbc:mysql://localhost:3306/my_store";
		String user = "root";
		String pass = "password";
		
		System.out.println("Connecting to databse...");
		
		// Try-with-resources: Auto-closes connection even if an error occurs
		try (Connection conn = DriverManager.getConnection(url, user, pass)) {
			if (conn != null) {
				System.out.println("Success! Connected to: " + conn.getMetaData().getDatabaseProductName());
			}
		} catch (SQLException e) {
			System.out.println("Connection failed! Check if MySQL is running.");
		}
	}
}