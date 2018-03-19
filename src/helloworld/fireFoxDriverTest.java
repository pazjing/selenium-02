package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxDriverTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Firefox
        System.setProperty("webdriver.gecko.driver",projectLocation+"/lib/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://xPathTest.com");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());


        driver.quit();
        //driver.close();


    }
}
