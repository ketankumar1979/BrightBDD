package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CalanderExample {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.opodo.co.uk/flights/");
        driver.manage().window().maximize();
      //driver.findElement(By.xpath("//*[@id=\"mad-client-gdpr-banner-button\"]/span/span")).click();

    }//set up method end

    @Test
    public void expedia() {

         WebElement flightbutton = driver.findElement(By.id("tab-flight-tab-hp"));
          flightbutton.click();

        WebElement departingbox = driver.findElement(By.id("flight-departing-hp-flight"));
        departingbox.click();

       WebElement Maycalandermonth = driver.findElement(By.xpath("//div[@class='col gcw-date-field']//div[2]//table[1]"));
       // To verify whether hidden element is displayed or not
        System.out.println(Maycalandermonth.isDisplayed());
        //Take all dates in the Lists
        List<WebElement> alldates = Maycalandermonth.findElements(By.cssSelector(".datepicker-cal-date"));

       for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

           if (alldate.getText().contains("7")) {
               alldate.click();
          }//if block end
        }//for loop end
    }//class end


    @Test
    public void southallTravel() {

        WebElement departingfield = driver.findElement(By.id("deptdt"));
        departingfield.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText()); //to print all the dates

           if (date.getText().equals("16")) {
               date.click();
            }//if block end

        }//for loop end
    }//Test method end

    @Test
    public void esky() {
        WebElement departingfield = driver.findElement(By.id("departureDateRoundtrip0"));
       departingfield.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date : alldates){
           // System.out.println(date.getText());//to print all the dates

           if (date.getText().equals("3")){
               date.click();
                break;
            }//if block end

        }//for-each loop end

    }//@Test end.

    @Test
    public void opodo(){
        WebElement departingBox = driver.findElement(By.xpath("//*[@id=\"flights-manager\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div[1]/div[1]/div[2]"));
        departingBox.click();

WebElement maymonth = driver.findElement(By.xpath("//*[@id=\"flights-manager\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]"));
        List<WebElement> alldates = maymonth.findElements(By.cssSelector(".od-ui-calendar-day"));

        for (WebElement alldate : alldates){
            System.out.println(alldate.getText());

            if (alldate.getText().contains("7")){
                alldate.click();
            }
        }
    }

}//class end