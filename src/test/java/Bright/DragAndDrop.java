package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
    }
    @Test
    public void action(){
        driver.switchTo().frame(0);

        WebElement dropFrom = driver.findElement(By.id("draggable"));
        WebElement dropTo = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(dropFrom,dropTo).build().perform();
        action.dragAndDrop(dropFrom,dropTo).build().perform();
    }
}
