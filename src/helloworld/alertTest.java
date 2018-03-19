package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().sendKeys();
        //driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept(); ////Accept = ok done yes



    }
}

