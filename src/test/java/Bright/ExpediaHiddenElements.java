package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExpediaHiddenElements{
   public static WebDriver driver;

   @Before
   public void setup() {
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
       driver = new ChromeDriver();
       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://www.expedia.co.uk/");
       ////li[contains(@class,'open')]//div[contains(@class,'menu sticky gcw-menu')]
       //tab-flight-tab-hp
       driver.manage().window().maximize();
   }

   @Test
   public void expedia(){
       WebElement flightboxe = driver.findElement(By.id("tab-flight-tab-hp"));
       flightboxe.click();

       WebElement element = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"));
       element.click();

       //if i run only the below test then it will fail as element is not displayed.
       //if i run with above test then it will pass the test as the element is displayed.
       WebElement textbox = driver.findElement(By.xpath("//li[contains(@class,'open')]//div[contains(@class,'menu sticky gcw-menu')]"));
       System.out.println(textbox.isDisplayed());

   }
}
