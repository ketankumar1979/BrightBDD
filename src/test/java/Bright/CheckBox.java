package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
    @Test
    public void checkBox() throws InterruptedException {
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println(benzCheckBox.isSelected());
        System.out.println(benzCheckBox.isSelected());
    }
}//class end
