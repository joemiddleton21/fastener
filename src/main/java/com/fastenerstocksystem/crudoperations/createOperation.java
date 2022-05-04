/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastenerstocksystem.crudoperations;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.text.ParseException;
import static java.lang.System.exit;
/**
 *
 * @author Me
 */

public class createOperation
{

    public static void createOperation() throws SQLException, FileNotFoundException {

        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());


        //Registering the Driver
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        //String mysqlUrl = "jdbc:mysql://localhost:3306/courseregistration?useSSL=false";
      String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/fastener?useSSL=false";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "Freuchie21!");
        System.out.println("Connection established......");

        String sql = "INSERT INTO course VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        // Inserting course records
        String fastener_type =  "Screw";
        pstmt.setInt(1, 4);
        pstmt.setString(2, fastener_type);
        pstmt.setString(3, "Screw");
        pstmt.setInt(4, 2);
        pstmt.setInt(5, 3);

        // check for duplicates
        checkDuplicate cd = new checkDuplicate();
        int noRecords =  cd.checkDuplicate(fastener_type);
        if (noRecords > 0) {
           System.out.println("Duplicate Record! Record cannot be inserted.");
           exit(0);
        }
        
        // Executing the statement
        pstmt.execute();
        System.out.println("Record inserted......");
    }
}