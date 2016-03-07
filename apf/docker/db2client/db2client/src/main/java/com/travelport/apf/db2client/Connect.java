/*
 */
package com.travelport.apf.db2client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author peter
 */
public class Connect {

    public static void main(String... args) {
        String databaseURL = null;
        if (args.length > 0) {
            databaseURL = args[0];
        } else {
            databaseURL = "jdbc:db2://localhost:50000/sample";
        }
        try {
            // Load DB2 Driver for JDBC class
            Class.forName("com.ibm.db2.jcc.DB2Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("db2jcc,db2jcc4 jars are not in the classpath.", ex);
        }
        // Set user and password properties
        Properties properties = new Properties();
        properties.put("user", "db2inst1");
        properties.put("password", "magic_mike");
        properties.put("retreiveMessagesFromServerOnGetMessage", "true");
        // Get a connection
        Connection conn;
        try {
            conn = DriverManager.getConnection(databaseURL, properties);
        } catch (SQLException ex) {
            throw new RuntimeException("cannot connect to db2 database.", ex);
        }
        System.out.println("connection to sample db2 database ["
                + databaseURL
                + "] successful!");

    }
}
