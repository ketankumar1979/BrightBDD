package BrightBDD.StepDefinitions;

import BrightBDD.PageObject.FacebookPageClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSteps {

    FacebookPageClass facebookPageClass = new FacebookPageClass();

    @Given("^user is on the home page of Facebook$")
    public void userIsOnTheHomePageOfFacebook() {
    }

    @When("^user types \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userTypesAnd(String arg0, String arg1)  {
        facebookPageClass.facebookLogin(arg0,arg1);
    }

    @Then("^user should able to login successfully$")
    public void userShouldAbleToLoginSuccessfully() {
    }
}
