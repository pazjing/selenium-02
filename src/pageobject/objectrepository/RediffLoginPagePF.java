package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPagePF {

    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "login")
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement go;

    @FindBy(linkText = "Home")
    WebElement home;


    public WebElement userName() {
        return username;
    }

    public WebElement password() {
        return password;
    }

    public WebElement submit() {
        return go;
    }

    public WebElement home() {
        return home;
    }


}
