package BrightBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "C:\\Users\\ketan\\BrightBDD\\src\\test\\Resource\\ResultPage.feature")
//@CucumberOptions(features = "src/test/Resource/ResultPage.feature", tags = {"@smoke"})
@CucumberOptions(features = "src/test/Resource", tags = {"@smoke"})

public class RunCukeTest {

}
