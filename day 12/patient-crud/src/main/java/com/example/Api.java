package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Api {
    private Connection connection;
    public Api(){
        connection = Connection.getConnect();
    }
    public void deleteById(int id){
        try{
            String qry = "delete from ptients where id=?";
            PreparedStatement stmt = connection.prepareStatement(qry);
             
        }catch(SQLException se){}
    }
    public void findAll(){
        try{
            String qry = "select * from patients";
            PreparedStatement stmt = connection.prepareStatement(qry);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name")+" "+rs.getInt("id")+" "+rs.getInt("age")+" "+rs.getString("gender")+" "+rs.getDouble("bmi"));
                stmt.close();
            }
        }catch(SQLException se){}
    }
    public void updateTable (int id, double wt){
        try{
            String qry = "select heightfrom patients where id=?";
            PreparedStatement state = connection.prepareStatement(qry);
            state.setInt(1,id);
            ResultSet rs = state.executeQuery();
            if(!rs.next()) System.out.println("No patients record");
            else{
                double ht = rs.getDouble("height"), bmi =wt/(ht*ht);
                qry = "update patients set weight=?, bmi=? where id=?";
                state = connection.prepareStatement(qry);
                state.setDouble(1,wt);
                state.setDouble(2,bmi);
                state.setDouble(3,id);
                int count = state.executeUpdate();
                if(count!=0) System.out.println(id+" weight & bmi updated");
                else    System.out.println("Update failed");
                state.close();
            }
        }catch(SQLException se){}
    }
    public  void creditTable(){
        try{
            String qry = "create table patients (id int not null primary key auto_increment, name varchar(100) not null, gender varchar(10) nont null, age int nit null, heigth double not null, weight double not null, bmi double not null)";
            PreparedStatement state = new connection.prepareStatement(qry);
            state.execute();
            System.out.println("Table has created");
        }catch(SQLException s){}
    }

    public void insertRecord(String nm, String gen, int age, double ht, double wt){
        try{
            ht /=100;
            double bmi = wt/(ht*ht);
            String qry = "insert into patients(name,gender,age,height,weight,bmi) values(?,?,?,?,?,?)";
            PreparedStatement state = connection.prepareStatement(qry);
            state.setString(1,nm);
            state.setString(2,gen);
            state.setString(3,age);
            state.setString(4,ht);
            state.setString(5,wt);
            state.setString(6,bmi);

            int count = state.executeUpdate();
            if(count != 0)
                System.out.println("Patient "+nm+" registered");
            else
                System.out.println(nm+" hasn't registered");
        }
        catch(SQLException se){}
    }
    
}

