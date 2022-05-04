///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package checkpassword.fastenerstock;

///**
// *
// * @author Joe_m
// */
import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertEquals {

    public AssertEquals() {

    }

    @Test
    public void testMain() throws InterruptedException {
        int Expectedlength = 1;
        String password1 = "abc012345";
        String password2 = "ab32";
        String password3 = "abcdefg12345";
//        boolean letterStatus = checkLetter(password1);
        boolean passwordStatus = checkPasswordLength(password1);
        int ActualLength = 0;
        if (passwordStatus == true) {
            System.out.println("First three characters are letters!");
            ActualLength = 1;
        }
        Assert.assertEquals(Expectedlength, ActualLength);
    }

    // method to check if length of pasword is between 6 and 10
    public boolean checkPasswordLength(String password) {
        boolean check = true;
        if (!(password.length() >= 6 && password.length() <= 10)) {
            System.out.println("length of password is between is between 6 and 10.");
            check = false;
        }
        return check;
    }
    
    
}
