package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://login.salesforce.com");

        /* css
              tagname[attribute='value']    //    xpath :  //tagname[@attribute='value']
              [attribute='value']   any tagname is ok   //xpath: use * to wildcard
           css shortcut
              #id
              .class      // if space inside the classname, replace the space with .
         */

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("username1");
        driver.findElement(By.cssSelector("#password")).sendKeys("password1");
        driver.findElement(By.cssSelector("[id='Login']")).click();


        driver.quit();



    }
}
