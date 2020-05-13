package Bright;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotOfResult {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }//set up method end

    @Test
    public void result() throws InterruptedException {
        WebElement loginButoon = driver.findElement(By.id("u_0_b"));
        loginButoon.click();
        Thread.sleep(3000); //very important. without it may take homepage screenshot.
    }
    @After
    public void teardown() throws IOException {

        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\ketan\\Desktop\\ScreenShotFile.png");
        FileUtils.copyFile(sourcefile,destinationfile);

    }
}
