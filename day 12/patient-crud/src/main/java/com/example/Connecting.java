package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting {
    public static Connection getConnect(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement_training", "root", "123vaishu");
        }
        catch(SQLException se){};
        return connection;
    }
}
