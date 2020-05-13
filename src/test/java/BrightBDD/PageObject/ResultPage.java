package BrightBDD.PageObject;

import BrightBDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Running')]")
    WebElement categories;

    @FindBy(xpath = "//label[@id='filter-price-£5 - £10-label']//div[@class='checkboxWrapper']")
    WebElement pricerange;

    public void selectcategory(){
         categories.click();

    }

    public void priceCheckBox(){
        pricerange.click();
    }

}
