package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class childWindowTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup");

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/p/a")).click();
        System.out.println(driver.getTitle());

        Set<String> windowsIds = driver.getWindowHandles();
        Iterator<String>  windowsIt = windowsIds.iterator();
        String parent = windowsIt.next();
        String child = windowsIt.next();

        driver.switchTo().window(child);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());



    }

}
