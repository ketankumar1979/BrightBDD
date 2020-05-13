package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutocompleteDropdown {
    public static WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/");
        driver.manage().window().maximize();
    }//set up method end

    @Test
    public void expedia() throws InterruptedException {
        WebElement destinationfield = driver.findElement(By.xpath("//*[@id=\"hotel-destination-hp-hotel\"]"));
        System.out.println(destinationfield.isEnabled());
        destinationfield.sendKeys("Del");
        Thread.sleep(4000);

        List<WebElement> destinations = driver.findElements(By.cssSelector(".results-item"));
        for (WebElement  destination : destinations){
              System.out.println(destination.getText());

            if (destination.getText().contains("Delhi (DEL - Indira Gandhi Intl.)")){
                destination.click();
                break;
           }
        }
    }

    @Test
    public void argos(){
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("nike");

        List<WebElement> searchResults = driver.findElements(By.cssSelector("._3a8zN "));
        for (WebElement searchResult : searchResults){
            System.out.println(searchResult.getText()); //very important to print
            if (searchResult.getText().contains("watch")){
                searchResult.click();
                break;
            }
        }




    }
}
