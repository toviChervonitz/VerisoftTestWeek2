package PageObject;

import Utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "userName-value")
    public WebElement userLogin;

    @FindBy(id = "gotoStore")
    public WebElement gotoStore;


}
