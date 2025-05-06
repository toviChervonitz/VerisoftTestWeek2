package Flows;

import Utils.Base;
import org.openqa.selenium.JavascriptExecutor;


import static org.testng.Assert.*;

public class LoginFlow extends Base {

    public static void login(String userName, String password) {
        try{
            loginPage.txt_userName.sendKeys(userName);
            loginPage.txt_password.sendKeys(password);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",loginPage.btn_login );
            loginPage.btn_login.click();
        }
        catch (Exception e){
            fail("the login failed , error massage is: "+ e.getMessage());
        }
    }
}
