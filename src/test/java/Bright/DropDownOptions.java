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

public class DropDownOptions {

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
    public void DropDownDemo() throws InterruptedException {

        WebElement Dropdownoption = driver.findElement(By.id("carselect"));
        Select sel = new Select(Dropdownoption);

        //select  and de-select(if you want) individual element in the dropdown.
         sel.selectByIndex(0);
        Thread.sleep(2000); //Thread.sleep will give you time to see the selection of element.
         //sel.deselectByIndex(0);

        sel.selectByValue("benz");
        Thread.sleep(2000);

        sel.selectByVisibleText("Honda");

        //To check which options have been selected from the dropdown list.
        //List<WebElement> options = sel.getAllSelectedOptions();
        List<WebElement> options = sel.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText()); //if u need printout then u must get txt.
        }//for loop end

    }//@Test  method end

    @Test
    public void RadioButoon(){
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        bmwRadioButton.click();

        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        benzRadioButton.click();

        System.out.println(bmwRadioButton.isSelected());
        System.out.println(benzRadioButton.isSelected());
    }//RadioButton method end

    @Test
    public void checkBox() throws InterruptedException {
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println(benzCheckBox.isSelected());
        System.out.println(benzCheckBox.isSelected());
    }


}//class end
