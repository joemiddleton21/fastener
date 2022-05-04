/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastenerstocksystem.crudoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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

public class readOperation
{
    /*
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {


      
    }
    */
    
 
    public static void readOperation(String coursecode) throws SQLException, FileNotFoundException {
        //System.out.println("Check code: "+coursecode);
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/fastener?useSSL=false";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "Freuchie21!");
             
            String sql = "select * from course";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
               if (resultSet.getString("fastener_type").toUpperCase().equals(coursecode.toUpperCase())){
                    System.out.println("Check type: "+coursecode);
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getString("fastener_type"));
                    System.out.println(resultSet.getString("thread_type"));
                    System.out.println(resultSet.getString("thread_desc"));
                    System.out.println(resultSet.getString("thread_length"));
               }
            }
            resultSet.close();

    }
}