package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

    @FindBy(id = "userName")
    public WebElement txt_userName;

    @FindBy(id = "password")
    public WebElement txt_password;

    @FindBy(id = "login")
    public WebElement btn_login;



}
