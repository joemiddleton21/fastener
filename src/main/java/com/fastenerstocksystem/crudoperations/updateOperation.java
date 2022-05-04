/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastenerstocksystem.crudoperations;

import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class updateOperation {
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        // method to insert data into a database
        updateOperation(30, "Screw");   
      
    }
 
    public static void updateOperation(int creditunit, String coursecode) throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/fastener?useSSL=false";
             Connection con = DriverManager.getConnection(mysqlUrl, "root", "Freuchie21!");
            
            
            String sql = "update course set creditunit=? where coursecode=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, creditunit);
            preparedStatement.setString(2, coursecode);
            
            // check for duplicates
            checkDuplicate  cd = new checkDuplicate();
            int noRecords =  cd.checkDuplicate(coursecode);
            if (noRecords < 1) {
               System.out.println("No Record found! Record cannot be updated.");
               exit(0);
            }
        
            int row  = preparedStatement.executeUpdate();
            System.out.println(row);
            
            preparedStatement.close();

    }
}
