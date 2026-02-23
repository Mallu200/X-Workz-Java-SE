import java.sql.*;

public class UserRegistration {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/my_store";
        String user = "root";
        String pass = "password";
		
		try (Connection conn = DriverManager.getConnection(url, user, pass)) {
			String sql = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
			Statement st = conn.createStatement();
			
			// executeUpdate is used for INSERT, UPDATE, DELETE
			int rowsAffected = st.executeUpdate(sql);
			
			System.out.println("User registered! Rows added: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}