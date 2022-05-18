///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///**
// *
// * @author Joe_m
// */

package checkpassword.fastenerstock;


import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertTrue {

    public AssertTrue() {

    }

    @Test
    public void testMain() throws InterruptedException {
        int Expectedlength = 1;
        String password1 = "abc012345";
        boolean letterStatus = checkLetter(password1);
//        boolean passwordStatus = checkPasswordLength(password1);
        int ActualLength = 0;
        if (letterStatus == true) {
            System.out.println("First three characters are letters!");
            ActualLength = 1;
        }
        Assert.assertEquals(Expectedlength, ActualLength);
    }

    public boolean checkLetter(String password) {
        boolean check = true;
// using simple for-loop to iterates the first three characters in the string 
        for (int i = 0; i < 3; i++) {
// check to see if character is a letter or not. 
// the isLetter() or isAlphabetic() method can be used 
            if (!Character.isLetter(password.charAt(i))) {
                System.out.println(i + " is a letter.");
                check = false;
            }
        }
        return check;
    }
    
}
