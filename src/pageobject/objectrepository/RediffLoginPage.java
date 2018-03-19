package pageobject.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffLoginPage {

    WebDriver driver;

    public RediffLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.name("login");
    By password = By.name("passwd");
    By go = By.name("proceed");
    By home = By.linkText("Home");

    public WebElement userName() {
        return driver.findElement(username);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement submit() {
        return driver.findElement(go);
    }

    public WebElement home() {
        return driver.findElement(home);
    }

}
