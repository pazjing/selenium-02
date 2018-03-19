package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headless {

    @Test
    public void OpenChromeTest() {
        String projectLoc = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectLoc + "/libs/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
//        设置为 headless 模式 （必须）
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }


}

