package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator02 {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //firefox
        System.setProperty("webdriver.gecko.driver",projectLocation + "/lib/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://facebook.com/");

        driver.findElement(By.id("email")).sendKeys("seleniumTest");
        driver.findElement(By.name("pass")).sendKeys("123456");

        driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div[1]/div[1]/input")).sendKeys("hello");

        //driver.findElement(By.linkText("Forgotten account?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();


        //driver.quit();



    }
}
