package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfElements {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();
    }

    @Test

    public void RadioButoon(){


        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));

        for (WebElement radiobutton : radiobuttons){
            System.out.println(radiobutton.getAttribute("value"));//printout all the radiobutton by getting attribute
            //System.out.println(radiobutton.getText()); //can not able to get value by text.
         // radiobutton.click(); //it will click on all the radio button

            if (radiobutton.getAttribute("value").contains("bmw")){
                radiobutton.click(); //it will click on bmw only
            }//if loop end


        }//for-each loop end
    }//Test method end

    @Test
    public void checkBoxList(){
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));

        for (WebElement checkbox : checkboxes){
            System.out.println(checkbox.getAttribute("value"));//printout by getting attribute
            //System.out.println(checkbox.getText()); //can not able to get value by text.
            //checkbox.click(); //it will click on all the checkbox


            if (checkbox.getAttribute("value").contains("bmw")) {
               checkbox.click(); //it will click on only bmw
               // break;
            }//if block end


        }//for each loop end
    }

    @Test
    public void Nike(){

        List<WebElement>  allstarts = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-4132xt-5.gywEET"));
        //List<WebElement>  allstarts = driver.findElements(By.cssSelector("label[direction=column]"));

        for (WebElement allstar : allstarts){
            System.out.println(allstar.getAttribute("id"));
            if (allstar.getAttribute("id").contains("4 or more-label")){
                allstar.click();
           }
        }
    }
}
