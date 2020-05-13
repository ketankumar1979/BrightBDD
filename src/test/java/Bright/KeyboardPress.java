package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyboardPress {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
    @Test
    public void keyPress(){
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("ketan@gmail.com");
        username.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("12345678");
        password.sendKeys(Keys.ENTER);

    }
    @Test
    public void combineKeyPress(){
        WebElement bmwradio = driver.findElement(By.id("bmwradio"));
        bmwradio.click();

        bmwradio.sendKeys(Keys.CONTROL + "a", Keys.CONTROL +"c");

        WebElement searchbox = driver.findElement(By.id("name"));
        searchbox.click();
        searchbox.sendKeys(Keys.CONTROL + "v");
    }

}
