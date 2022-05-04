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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class deleteOperation {
    
    /*
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

      
    }
    */

    public static void deleteOperation(String fastener_type) throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/fastener?useSSL=false";
             Connection con = DriverManager.getConnection(mysqlUrl, "root", "Freuchie21!");
            
            String sql = "delete from course where coursecode=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, fastener_type);
            
            // check for duplicates
            checkDuplicate  cd = new checkDuplicate();
            int noRecords =  cd.checkDuplicate(fastener_type);
            if (noRecords < 1) {
               System.out.println("No Record found! Record cannot be deleted.");
               exit(0);
            }
        
            int row  = preparedStatement.executeUpdate();
            System.out.println(row);
            
            preparedStatement.close();

    }
}
