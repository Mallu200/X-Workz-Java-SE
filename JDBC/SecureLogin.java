import java.sql.*;

public class SecureLogin {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_store";
        String user = "root";
        String pass = "password";

        String query = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            // Mapping values safely to the ? markers
            pstmt.setString(1, "john@example.com");
            pstmt.setString(2, "secret123");

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Welcome back, " + rs.getString("name") + "!");
            } else {
                System.out.println("Invalid email or password.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}