package org.abhishekjha.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Address" +
                    " (ID INT PRIMARY KEY, StreetName VARCHAR(50)), City VARCHAR(20");
            System.out.println("Table created successfully");
            statement.close();

            statement = conn.createStatement();
            count  = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) " +
                    "VALUES (1, '123 Main St', 'New York')");
            System.out.println(count + " record(s) inserted successfully");
            statement.close();

            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Address");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String streetName = rs.getString("StreetName");
                String city = rs.getString("City");
                System.out.println("ID: " + id + ", Street Name: " + streetName + ", City: " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
