package org.abhishekjha.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    // volatile keyword ensures that changes in a variable are immediately propagated to all other
    // threads. Values are directly read from and written to the main memory.
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;

    // private constructor to prevent instantiation
    private DbSingleton() {
//        try {
//            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        if (null != conn) {
//            throw new RuntimeException("Use getConnection() method to create");
//        }

        if (null != instance) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (null == instance) {
            synchronized (DbSingleton.class) {
                if (null == instance) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() {
        if (null == conn) {
            synchronized (DbSingleton.class) {
                if (null == conn) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
}
