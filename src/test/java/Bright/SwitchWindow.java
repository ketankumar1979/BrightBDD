package Bright;

import javafx.scene.control.Tab;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
    public static WebDriver driver;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }//set up method end

    @Test
    public void Switch() throws InterruptedException {

        //Saving arogos window handle
        String argosHandle = driver.getWindowHandle();
        //System.out.println(argosHandle);

        //opening another tab with facebook url
        JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.open(arguments[0])","https://www.facebook.com/" );

        Thread.sleep(20000);

        //set both open windows handle
        Set<String> handles = driver.getWindowHandles();

        //for-each loop to print both window handles, if block to switch on second window
        for (String handle : handles) {

            if (!handle.equals(argosHandle)) {
                driver.switchTo().window(handle);
                System.out.println(handle);
                break;
            }//if block end
        }//for loop end

           //store facebook window handle
            String facebookHandle = driver.getWindowHandle();

            Thread.sleep(10000);

            driver.switchTo().window(argosHandle);

            Thread.sleep(10000);

            driver.switchTo().window(facebookHandle);

          }

         }
