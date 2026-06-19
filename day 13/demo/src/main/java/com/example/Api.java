package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Api {
    private Connection connection;
    public Api(){
        connection = Connection.getConnect();
    }
    public void createTable(){
        try{
            String qry = "create table Customer(customerID int not null primary key auto_increment, cName varchar(255) not null, cDob date not null, cPhone bigint not null)";
            PreparedStatement state = connection.prepareStatement(qry);
            state.execute();
            System.out.println("Table has been created ! ");
        }catch(SQLException se){}
    }
    public void insertRecord(String nm, Date dob, long phone){
        try{
            String qry = "insert into customer(cName, cDob, cPhone) values(?,?,?)";
            PreparedStatement state = connection.prepareStatement(qry);
            state.setString(1, nm);
            state.setDate(2, dob);
            state.setLong(3, phone);

            int count = state.executeUpdate();
            if(count != 0)
                System.out.println("Inserted data successfully !");
            else
                System.out.println("Hasn't registered !!");

        }catch(SQLException se){}

    }
}
