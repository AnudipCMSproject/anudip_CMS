package com.anudip.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Connecion Properties
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://127.0.0.1:3306/hoteldb";
    public static final String username = "root";
    public static final String password = "B@2002";

    private static Connection con;

    public static Connection connectDB() {
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println();
                System.out.println("\t \t *************** Failed To Connect DataBase ");
            }
        } catch (ClassNotFoundException e) {
            System.out.println();
            System.out.println("\t \t ************** Driver Not Found");
        } finally {
            System.out.println();
        }
        return con;
    }
}
