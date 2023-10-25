package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FirstConnection {

    public static void main(String[] args) {
        String dburl = "jdbc:mysql://192.168.2.100:3306/classic_models";
        String user = "dev";
        String password = "ultra30dev";

        try (Connection connection = DriverManager.getConnection(dburl, user, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter an employee first name: ");
            String firstname = scanner.nextLine();

            String sql = "SELECT * FROM employees WHERE firstname = ?";
            System.out.println(sql);

            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, firstname);
                try (ResultSet result = stmt.executeQuery()) {
                    while (result.next()) {
                        int id = result.getInt("id");
                        String name = result.getString("firstname");
                        String email = result.getString("email");
                        System.out.println(id + " | " + name + " | " + email);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

