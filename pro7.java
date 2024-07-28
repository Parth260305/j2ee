Import java.sql.*;

Public class InsertEmployee {
    Public static void main(String[] args) {
        // Database connection settings
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “Parth Chavda”;
        String password = “your_password”;

        // Employee data
        String name = “Parth Chavda”;
        String email = parthchavda@example.com;
        String department = “Marketing”;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             CallableStatement cs = conn.prepareCall(“{call insert_employee(?, ?, ?)}”)) {

            // Set parameter values
            Cs.setString(1, name);
            Cs.setString(2, email);
            Cs.setString(3, department);

            // Execute the stored procedure
            Cs.execute();

            System.out.println(“Employee record inserted successfully!”);
        } catch (SQLException e) {
            System.err.println(“Error inserting employee record: “ + e.getMessage());
        }
    }
}
