package com.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scan = new Scanner(System.in);
        Api api = new Api();
        System.out.println("-------Welcome to Nitte Hospital------");
        while(true){
            System.out.println("1. Admit\n2. Records\n 3. Update\n 4. Discharge\n Any to exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Enter your name :");
                    String name = scan.next();
                    System.out.println("Gender :");
                    String gender = scan.next();
                    System.out.println("Age :");
                    String age = scan.nextInt();
                    System.out.println("Height :");
                    String height = scan.nextDouble();
                    System.out.println("Weight :");
                    String weight = scan.nextDouble();
                    api.insertRecord(name, gen,age,height,weight);
                    break;
                case 2: 
                    api.findAll();
                    break;
                case 3: 
                    System.out.println("Enter id ");
                    int id = scan.nextInt();
                    System.out.println("Enter the weight ");
                    weight = scan.nextDouble();
                    api.updateTable(id, weight);
                    break;
                case 4: 
                    System.out.println("Enter id :");
                    id = scan.nextInt();
                    api.deleteById(id);
                    break;
                default: return;
            }
            System.out.println();
        }
        //api.creditTable(); // call create table functions

        //call the function tht inserts values into the table
        /*System.out.println("Enter your name :");
        String name = scan.nextLine();
        System.out.println("Gender :");
        String gender = scan.next();
        System.out.println("Age :");
        String age = scan.nextInt();
        System.out.println("Height :");
        String height = scan.nextDouble();
        System.out.println("Weight :");
        String weight = scan.nextDouble();
        api.insertRecord(name, gen,age,height,weight);
        */

        //updates the value
        /*System.out.println("Enter id ");
        int id = scan.nextInt();
        System.out.println("Enter the weight ");
        double weight = scan.nextDouble();
        api.updateTable(id, weight);
        api.createTable();*/

        //to retrieve all the data from the table
        //api.findAll();

        //to delete specific data from the table
        /*System.out.println("Enter id :");
        int id = scan.nextInt();
        api.deleteById(id);
        api.findAll();*/
    }
}
