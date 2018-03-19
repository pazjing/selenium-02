package practice;

import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class tableGrid {

    public static void main(String[] args) throws IOException {
        String projectLoc = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectLoc + "/lib/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19236/cob-vs-war-16th-match-csa-t20-challenge-2017");

        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child" +
                "(3)")).size();

        int actualTotal = 0;

        for (int i = 0; i < rowCount-2; i++) {
            String score = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] " +
                    "div:nth-child(3)")).get(i).getText();
            actualTotal += Integer.parseInt(score);
        }


        String extrasScore = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]"))
                .getText();
        actualTotal += Integer.parseInt(extrasScore);

        String Total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]"))
                .getText();

        int totalInWeb = Integer.parseInt(Total);

        Assert.assertEquals(actualTotal,totalInWeb);

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(projectLoc + "/screenshot.png"));

        System.out.println(projectLoc);


    }

}
