package BrightBDD.PageObject;

import BrightBDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends DriverFactory {
    @FindBy(xpath = "//a[contains(text(),'Nike Football Pump')]")
    WebElement fiveToTenPoundItem;

    public void clickOnPriceRangeItem(){
        fiveToTenPoundItem.click();
    }

}
