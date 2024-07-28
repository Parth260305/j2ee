Import java.sql.*;

Public class EmpCRUD {
    Public static void main(String[] args) {
        // Database connection settings
        String dbUrl = “jdbc:mysql://localhost:3306/your_database”;
        String username = “your_username”;
        String password = “your_password”;

        Try (Connection conn = DriverManager.getConnection(dbUrl, username, password)) {
            // Create
            createEmp(conn, 101, “Parth Chavda”, parthchavda@example.com);
            createEmp(conn, 102, “Parth Chavda”, parthchavda@example.com);

            // Read
            System.out.println(“Employees:”);
            readEmps(conn);

            // Update
            updateEmp(conn, 101, “Parth Chavda Updated”, parthchavda.updated@example.com);

            // Read again to see the update
            System.out.println(“Employees after update:”);
            readEmps(conn);

            // Delete
            deleteEmp(conn, 102);

            // Read again to see the deletion
            System.out.println(“Employees after deletion:”);
            readEmps(conn);
        } catch (SQLException e) {
            System.err.println(“Error performing CRUD operations: “ + e.getMessage());
        }
    }

    Private static void createEmp(Connection conn, int empno, String name, String email) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(“INSERT INTO emp (empno, name, email) VALUES (?,?,?)”);
        Ps.setInt(1, empno);
        Ps.setString(2, name);
        Ps.setString(3, email);
        Ps.executeUpdate();
    }

    Private static void readEmps(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(“SELECT * FROM emp”);
        While (rs.next()) {
            System.out.println(“Empno: “ + rs.getInt(“empno”) +
                    “, Name: “ + rs.getString(“name”) +
                    “, Email: “ + rs.getString(“email”));
        }
    }

    Private static void updateEmp(Connection conn, int empno, String name, String email) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(“UPDATE emp SET name =?, email =? WHERE empno =?”);
        Ps.setString(1, name);
        Ps.setString(2, email);
        Ps.setInt(3, empno);
        Ps.executeUpdate();
    }

    Private static void deleteEmp(Connection conn, int empno) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(“DELETE FROM emp WHERE empno =?”);
        Ps.setInt(1, empno);
        Ps.executeUpdate();
    }
}
