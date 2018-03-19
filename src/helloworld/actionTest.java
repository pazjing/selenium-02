package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        Actions action_1 = new Actions(driver);
        action_1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
        action_1.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hello");



    }
}
