import java.sql.*;

public class InventoryDashboard {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_store";
        String user = "root";
        String pass = "password";

        String sql = "SELECT id, product_name, price FROM products";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("--- Current Inventory ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("product_name");
                double price = rs.getDouble("price");
                
                System.out.printf("ID: %d | Item: %-15s | Price: $%.2f%n", id, name, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}