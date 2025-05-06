package Flows;

import Utils.Base;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.fail;

public class HomeFlow extends Base {

    public static void goToStore(){
        try{
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",homePage.gotoStore);
            homePage.gotoStore.click();
        }
        catch (Exception e){
            fail("the login failed , error massage is: "+ e.getMessage());
        }

    }

}
