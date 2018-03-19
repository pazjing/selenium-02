package helloworld;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.TestNGAntTask.Mode.junit;

public class end2endMakeMyTrip {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        //Chrome
        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.makemytrip.com/");

        System.out.println("Before click anything (ONE WAY is selected). ");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[1]/label")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[1]/label")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isEnabled());


        System.out.println("After click MULTICITY. ");
        driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"js-multiCitySearchFrom_1\"]")).isDisplayed());

        System.out.println("Select Depart date");
        driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"dp1511476415059\"]/div/div[1]/table/tbody/tr[5]/td[3]")).click();



    }






}
