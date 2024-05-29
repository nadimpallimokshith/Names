import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NameDAO {
	private static final String URL = "jdbc:mysql://db:3306/test_db";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public List<String> getNames() {
        List<String> names = new ArrayList<>();

        try {
            // Explicitly load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT name FROM names LIMIT 100")) {
                
                System.out.println("Database connected successfully.");

                while (rs.next()) {
                    names.add(rs.getString("name"));
                }

            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL exception occurred.");
            e.printStackTrace();
        }

        System.out.println("Names fetched from database: " + names);
        return names;
    }
}
