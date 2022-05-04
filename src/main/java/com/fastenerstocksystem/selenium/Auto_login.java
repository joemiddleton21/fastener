/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastenerstocksystem.selenium;

/**
 *
 * @author Me
 */

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/**
 *
 * @author Me
 */
public class Auto_login {
    
    public Auto_login() {
    }
    
    /**
     * Test of main method, of class Selenium.
     */
    @Test
public void login() {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/users/sign_in");
WebElement username=driver.findElement(By.id("user_email_Login"));
WebElement password=driver.findElement(By.id("user_password"));
WebElement login=driver.findElement(By.name("commit"));
username.sendKeys("jm21@dundee.ac.uk");
password.sendKeys("abc123");
login.click();
String actualUrl="https://live.browserstack.com/dashboard";
String expectedUrl= driver.getCurrentUrl();
org.testng.Assert.assertEquals(expectedUrl,actualUrl);
}
    
}
