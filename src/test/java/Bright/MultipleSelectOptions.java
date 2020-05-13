package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelectOptions {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void multipleSelectOptions() throws InterruptedException {
        WebElement multipleoptionbox = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(multipleoptionbox);

        sel.selectByIndex(0);
        Thread.sleep(2000);

        sel.selectByValue("orange");
        Thread.sleep(2000);
        //sel.deselectByValue("orange");

        sel.selectByVisibleText("Peach");
        Thread.sleep(2000);

        //List<WebElement> options = sel.getOptions();

        List<WebElement> options = sel.getAllSelectedOptions();
        for (WebElement option : options){
            System.out.println(option.getText());
        }
    }
}//class end

