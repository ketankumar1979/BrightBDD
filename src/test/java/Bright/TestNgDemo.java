package Bright;

import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
    @BeforeMethod
    public void setup(){
        System.out.println("Before the method");
    }
    @Test(priority =1)
    public void saran(){
        System.out.println("saran method");
    }
    @Test(priority =2)
    public void ketan(){
        System.out.println("ketan method");
    }
    @Test(priority =3)
    public void saj(){
        System.out.println("saj method");
    }
    @Test(priority =4)
    public void chirag(){
        System.out.println("chirag method");
    }
    @Test(priority =5)
    public void vipul(){
        System.out.println("vipul method");
    }
    @AfterMethod
    public void after(){
        System.out.println("after method");

    }

}
