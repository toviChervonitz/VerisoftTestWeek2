package Flows;

import Utils.Base;

import static org.testng.Assert.fail;

public class BookStoreFlow extends Base {

    public static void searchBox(String search){
        try{
            clearSearch();
            bookStorePage.searchBox.sendKeys(search);
        }
        catch (Exception e){
            fail("the login failed , error massage is: "+ e.getMessage());
        }
    }

    public static void clearSearch(){
        bookStorePage.searchBox.click();
        bookStorePage.searchBox.clear();
    }







}
