package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPathTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //firefox
        System.setProperty("webdriver.gecko.driver",projectLocation + "/lib/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://qaclickacademy.com");

        driver.findElement(By.linkText("Interview Guide")).click();

        //click Selenium tab
        driver.findElement(By.xpath("//*[@id=\"tablist1-tab2\"]")).click();
        //click Appium tab - sibling
        driver.findElement(By.xpath("//*[@id='tablist1-tab2']/preceding-sibling::li[1]")).click();
        //click SoapUI tab - sibling
        driver.findElement(By.xpath("//*[@id='tablist1-tab2']/following-sibling::li[1]")).click();

        driver.findElement(By.xpath("//li[text()=' Testing ']")).click();
        //go to parent
        System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

        driver.quit();

    }
}
