package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTest {

    public static void main(String[] args) {

        String projectLocation = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com/");

        Select adultSelect = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        adultSelect.selectByValue("2");
        adultSelect.selectByIndex(5);
//        adultSelect.selectByVisibleText("8");

//        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[@value='GOI']")).click();
//        driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).click();
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).isSelected());

        driver.findElement(By.xpath("//input[@value='OneWay']")).click();
    }
}
