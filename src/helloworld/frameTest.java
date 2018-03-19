package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class frameTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

        driver.findElement(By.id("draggable")).click();
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);

        a.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Draggable")).click();





    }

}
