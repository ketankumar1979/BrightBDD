package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HiddenElements {
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
    public void hiddenElements(){
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        System.out.println(textbox.isDisplayed());

        WebElement hidebox = driver.findElement(By.id("hide-textbox"));
        hidebox.click();
        System.out.println(textbox.isDisplayed());

        WebElement showbox = driver.findElement(By.id("show-textbox"));
        showbox.click();
        System.out.println(textbox.isDisplayed());
    }
}

