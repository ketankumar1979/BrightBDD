package Bright;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public class AssertionDemo {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void argos(){
        String actual = driver.getCurrentUrl();
        //Assert.assertThat(actual, Matchers.endsWith("argos.co.uk/"));
        Assert.assertThat(actual, Matchers.equalToIgnoringCase("https://www.argos.co.uk/"));
         //Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));


    }







    @Test
    public void argos1(){
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("Nike");

        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();

        WebElement header = driver.findElement(By.xpath("//h1[@class='search-title__term']"));
        String actual = header.getText();
        Assert.assertThat(actual, Matchers.containsString("nike"));


        //Assert.assertThat(actual, Matchers.endsWith(""));
       // Assert.assertThat(actual, Matchers.containsString(""));
        //Assert.assertThat(actual, Matchers.equalToIgnoringCase(""));
        //Assert.assertThat(actual, Matchers.greaterThanOrEqualTo("5.00"));
        //Assert.assertThat(actual, Matchers.lessThanOrEqualTo("10.00"));







    }
}
