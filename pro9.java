Import java.sql.*;

Public class GetEmployeesByDesignation {
    Public static void main(String[] args) {
        // Database connection settings
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “your_username”;
        String password = “your_password”;

        // Get designation from user
        String designation = “Software Engineer”;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             CallableStatement cs = conn.prepareCall(“{call get_employees_by_designation(?)}”)) {

            // Set input parameter
            Cs.setString(1, designation);

            // Execute the stored procedure
            ResultSet rs = cs.executeQuery();

            // Display employee records
            While (rs.next()) {
                System.out.println(“Empno: “ + rs.getInt(“empno”) +
                        “, Name: “ + rs.getString(“name”) +
                        “, Email: “ + rs.getString(“email”));
            }
        } catch (SQLException e) {
            System.err.println(“Error retrieving employees: “ + e.getMessage());
        }
    }
}
