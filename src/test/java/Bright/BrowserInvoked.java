package Bright;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserInvoked {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
       driver.manage().window().maximize();
    }
}



class FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        //find searchbox element by ID
        //WebElement searchbox = driver.findElement(By.id("searchTerm"));
        //searchbox.sendKeys("Nike"); //used sendKeys method to type word Nike



        //find searchbox element by xpath
       //WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"searchTerm\"]"));


        //find searhbox element by css selector WITH ID(# declare ID)
        //WebElement searchbox = driver.findElement(By.cssSelector("#searchTerm"));
       // WebElement searchbox = driver.findElement(By.cssSelector("input[data-test=search-input]"));
        //WebElement searchbox = driver.findElement(By.cssSelector("input[data-test=search-input]"));

      //find searchbox element by css selector with any attribute. syntax is -  tag[attribute=value]
       //WebElement searchbox = driver.findElement(By.cssSelector("input[name=searchTerm]"));

        //find searchbox element by class name
        //WebElement searchbox = driver.findElement(By.className("_1Rz0y"));
        //searchbox.sendKeys("Nike");

        //find searchbox element by name attribute
       // WebElement searchbox = driver.findElement(By.name("searchTerm"));
       //searchbox.sendKeys("Nike"); //used sendKeys method to type word Nike



        //Search searchbutton element by className
       //WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));

       // WebElement searchbutton = driver.findElement(By.xpath("//span[@class=\'_1gqeQ\']"));
        // searchbutton.click();//used click method to click on button
    }
}

class FindElementByLinktext {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        //find Account button element by linktext
        WebElement accountButton = driver.findElement(By.linkText("Account"));
         accountButton.click();

        //find Wishlist button element by linktext
        WebElement wishlist = driver.findElement(By.linkText("Wishlist"));
        wishlist.click();
    }
}

class Amazon{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Nike");
        //WebElement searchbutton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement searchbutton = driver.findElement(By.cssSelector("input[tabindex='10']"));
        searchbutton.click();
    }
}

class ArgosElements{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("Nike");
        //WebElement searchbutton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();

        //Find elements of £5 - £10
        //WebElement pricerange = driver.findElement(By.xpath("//span[contains(text(),'£5 - £10')]"));
        WebElement pricerange = driver.findElement(By.xpath("//span[contains(text(),'£25 - £50')]"));
        pricerange.click();

    }
}