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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class checkDuplicate {
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        
        checkDuplicate  cd = new checkDuplicate();
        int noRecords =  cd.checkDuplicate("Screw");
        if (noRecords > 0) {
           System.out.println("Record found!");
        }
        else{
           System.out.println("No record found!");
        }
    }
    
    
    
    public static int checkDuplicate(String fastener_type) throws SQLException, FileNotFoundException {
       //Registering the Driver
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

      //Getting the connection
      String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/fastener?useSSL=false";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "Freuchie21!");
      
      //Creating the Statement object
      Statement stmt = con.createStatement();
      String query = "select fastener_type from fastener";
      
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      int count = 0;
      while (rs.next()) {
        if (rs.getString("Screw").toUpperCase().equals(fastener_type.toUpperCase())){
            count++;
        }
      }
      
      System.out.println("Number of records in the fastener table: "+count);
      return count;
    }
            
            
            
}
