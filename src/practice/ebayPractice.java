package practice;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayPractice {

   public static void main(String[] args) {

       String projectLocation = System.getProperty("user.dir");

       System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.ebay.com/");

       System.out.println("The page contains links number : " + driver.findElements(By.tagName("a")).size());

       WebElement footer = driver.findElement(By.id("glbfooter"));
       System.out.println("The footer contains links number : " + footer.findElements(By.tagName("a")).size());

       String beforeClick = driver.getTitle();

       WebElement col_footer = footer.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
       for (int i = 0; i < col_footer.findElements(By.tagName("a")).size(); i++)
       {
          if (col_footer.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
          {
              col_footer.findElements(By.tagName("a")).get(i).click();
              String afterClick = driver.getTitle();
              org.junit.Assert.assertNotEquals(beforeClick, afterClick);
              break;
          }
       }

   }
}
