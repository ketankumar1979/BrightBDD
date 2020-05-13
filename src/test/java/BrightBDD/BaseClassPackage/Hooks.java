package BrightBDD.BaseClassPackage;

import BrightBDD.BaseClassPackage.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    public DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup()  {
        driverFactory.openbrowser();
    }

    @After
    public void teardown() {
        driverFactory.closebrowser();
    }
}
