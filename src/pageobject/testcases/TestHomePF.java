package pageobject.testcases;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageobject.objectrepository.RediffHomePagePF;
import pageobject.objectrepository.RediffLoginPagePF;

public class TestHomePF {

    WebDriver driver;

    @Test(groups = "pageFactory")
    public void testGoHome(){

        String projectLoc = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectLoc + "/lib/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPagePF rLogin = new RediffLoginPagePF(driver);
        rLogin.userName().sendKeys("helloUsername");
        rLogin.password().sendKeys("helloPassword");
        //rLogin.submit().click();
        rLogin.home().click();

        RediffHomePagePF rHome = new RediffHomePagePF(driver);
        rHome.searchWords().sendKeys("rediff");
        rHome.searchSubmit().click();

    }

    @AfterMethod(groups = "pageFactory")
    public void testShutDown() {
        driver.quit();
    }

}
