Import java.sql.*;

Public class InsertDefaultEmployee {
    Public static void main(String[] args) {
        // Database connection settings
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “Parth Chavda”;
        String password = “your_password”;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             CallableStatement cs = conn.prepareCall(“{call insert_default_employee()}”)) {
            // Execute the stored procedure
            Cs.execute();
            System.out.println(“Default employee record inserted successfully!”);
        } catch (SQLException e) {
            System.err.println(“Error inserting default employee record: “ + e.getMessage());
        }
    }
}

