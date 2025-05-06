package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage {

    @FindBy(id = "searchBox")
    public WebElement searchBox;


}
