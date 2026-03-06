/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Replace 'sms_db' with your actual database name
    private static final String URL = "jdbc:mysql://localhost:3306/sms_db";
    private static final String USER = "root"; 
    private static final String PASS = ""; // Your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            return null;
        }
    }
}