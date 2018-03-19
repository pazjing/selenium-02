package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarPractice {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.findElement(By.id("travel_date")).click();

        //System.out.println(driver.findElement(By.xpath
        //        ("//div[@class='datepicker-days']/table[1]/thead[1]/tr[1]/th[2]")).getText());

        // Select March 21st
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
                .contains("March"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }


        int count = driver.findElements(By.className("day")).size();
        List<WebElement> days =  driver.findElements(By.className("day"));

        for (int i = 0; i < count; i++)
        {
            String text = days.get(i).getText();
            if(text.equalsIgnoreCase("21"))
            {
                days.get(i).click();
                break;
            }
        }

    }
}
