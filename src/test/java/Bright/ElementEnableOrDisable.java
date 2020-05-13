package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementEnableOrDisable {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"mad-client-gdpr-banner-button\"]/span/span")).click();

    }//set up method end

    @Test
    public void present(){
        WebElement departingbox = driver.findElement(By.id("hotel-checkin-hp-hotel"));
        System.out.println(departingbox.isEnabled());

    }
}
