/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastenerstocksystem.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Me
 */
public class EndToEndFillForm {
    public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "http://localhost:8030/index";					
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();				
        		
        driver.get(baseUrl);					
                
        //for (int i = 0; i<10000; i++){
        driver.findElement(By.linkText("Add Fastener")).click();
        driver.findElement(By.id("fastenerType")).sendKeys("Screw"); // increment matno							
        driver.findElement(By.id("threadType")).sendKeys("3.000-10 UNC-2B");
        driver.findElement(By.id("threadDesc")).sendKeys("3");
        driver.findElement(By.id("threadLength")).sendKeys("5in");
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("[type='submit']")).click();	
        //}
        
    }		
    
}
