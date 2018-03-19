package pageobject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.objectrepository.RediffHomePage;
import pageobject.objectrepository.RediffLoginPage;

public class TestHome {


    @Test(groups = "pageObject")
    public void testGoHome(){

        String projectLoc = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectLoc + "/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPage rLogin = new RediffLoginPage(driver);
        rLogin.userName().sendKeys("helloUsername");
        rLogin.password().sendKeys("helloPassword");
        //rLogin.submit().click();
        rLogin.home().click();

        RediffHomePage rHome = new RediffHomePage(driver);
        rHome.searchWords().sendKeys("rediff");
        rHome.searchSubmit().click();


    }
}
