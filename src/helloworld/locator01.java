package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator01 {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Firefox
        System.setProperty("webdriver.gecko.driver",projectLocation+"/lib/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://xPathTest.com");
        driver.findElement(By.xpath("/html/body/section[2]/div/a")).click();
        /*
           xpath:
             //tagname[@attribute='value']
             //*[@attribute='value']    --  * represent anything
         */

        driver.close();
    }
}
