package helloworld;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class gridTest {

    public static void main(String[] args) throws MalformedURLException {

        String projectLocation = System.getProperty("user.dir");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability(FirefoxDriver.BINARY, new File
                (projectLocation + "/lib/geckodriver").getAbsolutePath());
        capabilities.setBrowserName("firefox");
        capabilities.setPlatform(Platform.MAC);
        capabilities.setVersion("57.0");

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"),capabilities);

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());


    }
}
