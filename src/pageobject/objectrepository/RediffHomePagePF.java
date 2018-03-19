package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {


    WebDriver driver;

    public RediffHomePagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "srchword")
    WebElement searchWords;

    @FindBy(xpath = "//input[@value='Search']")
    WebElement searchSubmit;


    public WebElement searchWords() {

        return searchWords;
    }

    public WebElement searchSubmit() {

        return searchSubmit;
    }



}
