package org.abhishekjha.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address" +
                    " (ID INT PRIMARY KEY, StreetName VARCHAR(50)), City VARCHAR(20");
            System.out.println("Table created successfully");
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count  = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) " +
                    "VALUES (1, '123 Main St', 'New York')");
            System.out.println(count + " record(s) inserted successfully");
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAllAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Address");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String streetName = rs.getString("StreetName");
                String city = rs.getString("City");
                addresses.add(new Address(id, streetName, city));
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addresses;
    }
}

record Address(int id, String streetName, String city) {
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
