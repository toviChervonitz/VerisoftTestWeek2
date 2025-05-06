package Flows;

import PageObject.Book;
import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookFlow extends Base {

    public static void fillBooksArray(List<WebElement> listBooks){
        for (int i = 0; i < books.length; i++) {
            List<WebElement> temp =listBooks.get(i).findElements(By.className("rt-td"));
            books[i]=new Book(temp.get(1).getText(),temp.get(2).getText(),temp.get(3).getText());
        }
    }

    public static void printBook(Book book){
        System.out.println("the title is: "+ book.getTitle());
        System.out.println("the author is: "+ book.getAuthor());
        System.out.println("the publisher is: "+ book.getPublisher());
    }

}
