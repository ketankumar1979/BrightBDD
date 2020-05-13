package BrightBDD.PageObject;

import BrightBDD.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPageClass extends DriverFactory {

    @FindBy(id = "email")
    WebElement username;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "u_0_b")
    WebElement loginbutton;

    public void facebookLogin(String arg0, String arg1){
        username.sendKeys(arg0);
        password.sendKeys(arg1);
        loginbutton.click();
    }
}
