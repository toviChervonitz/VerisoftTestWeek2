package Tests;

import Flows.BookFlow;
import Flows.BookStoreFlow;
import Flows.HomeFlow;
import Flows.LoginFlow;
import PageObject.Book;
import PageObject.HomePage;
import Utils.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import static org.testng.Assert.*;


public class Tests extends Base {


    @Test(priority = 1)
    public void testLogin(){
        LoginFlow.login(getData("userName"),getData("password"));
        assertEquals(homePage.userLogin.getText(),getData("userName"));
    }

    @Test(priority = 2)
    public void goToStore(){
        HomeFlow.goToStore();
    }

    @Test(priority = 3)
    public void searchBook1() throws InterruptedException {
        BookStoreFlow.searchBox(getData("searchBox1"));
        assertEquals(driver.findElements(By.className("mr-2")).size(),1);
    }

    @Test(priority = 4)
    public void searchBook2(){
        BookStoreFlow.searchBox(getData("searchBox2"));
        assertEquals(driver.findElements(By.className("mr-2")).size(),0);
        assertEquals(driver.findElement(By.className("rt-noData")).getText(),"No rows found");
    }

    @Test(priority = 5)
    public void fillArrayBooks(){
        BookStoreFlow.clearSearch();
        driver.navigate().refresh();
        books = new Book[driver.findElements(By.className("mr-2")).size()];
        BookFlow.fillBooksArray(driver.findElements(By.className("rt-tr-group")));
    }

    @Test(priority = 6)
    public void printAllBooks(){
        for(Book book : books){
            BookFlow.printBook(book);
        }
    }

}
