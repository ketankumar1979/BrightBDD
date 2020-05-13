package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static WebDriver driver;

    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }//set up method end
    @Test
    public void RadioButoon(){
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        bmwRadioButton.click();

        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        benzRadioButton.click();

        System.out.println(bmwRadioButton.isSelected());
        System.out.println(benzRadioButton.isSelected());
    }//RadioButton method end
    @After
    public void teardown(){
        //driver.quit();
        //driver.close();
    }

}//class end
