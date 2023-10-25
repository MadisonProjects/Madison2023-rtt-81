public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://192.168.2.100:3306/classic_models";
        String user = "dev";
        String password = "ultra30dev";
        Connection connection = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // optional
        connection = DriverManager.getConnection(dburl, user, password);
        String sql = "Select * FROM employees where id = 1002;";
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
        Integer id = result.getInt("id");
        String name = result.getString("firstname");
        String email = result.getString("email");
        System.out.println(id + " | " + name + " | " + email);
        }
        result.close();
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
        if (connection != null) {
        connection.close();
        }
        }
        }
        FirstConnection.java
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.*;
public class Update_preparedSt_Example{
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user= "root";
        String password = "password";
        try {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            String sql = "update employees set firstName=? , lastName=? where employeeNumber = ?";

            prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, "Gary");
            prepStmt.setString(2, "Larson");
            prepStmt.setLong  (3, 0003);

            int rowsAffected = prepStmt.executeUpdate();

            prepStmt = con.prepareStatement("select * from employees where employeeNumber=?");
            prepStmt.setInt(1, 1401);
            // execute select query
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                // System.out.print(rs.getInt("lastName"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}



1



