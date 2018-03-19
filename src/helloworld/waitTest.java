package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");

        // Implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
        driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

        // Explict wait
        WebDriverWait dw = new WebDriverWait(driver, 10);
        //dw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"15399642\"]/div[2]/div/a")));
        dw.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"15399642\"]/div[2]/div/a")));

        driver.findElement(By.xpath("//*[@id=\"15399642\"]/div[2]/div/a")).click();



    }
}
