package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("http://xPathTest.com");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
        //driver.close();

    }
}
