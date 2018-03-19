package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {


    WebDriver driver;

    public RediffHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchWords = By.name("srchword");
    By searchSubmit = By.xpath("//input[@value='Search']");


    public WebElement searchWords() {

        return driver.findElement(searchWords);
    }

    public WebElement searchSubmit() {

        return driver.findElement(searchSubmit);
    }



}
