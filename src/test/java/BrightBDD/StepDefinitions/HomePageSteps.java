package BrightBDD.StepDefinitions;

import BrightBDD.PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
        homePage.getHomePageUrl();
    }

    @When("^user search for \"([^\"]*)\"$")
    public void userSearchFor(String item)  {
        homePage.multipleSearch(item);
    }

    @Then("^user should able to see all the products$")
    public void userShouldAbleToSeeAllTheProducts() {
        //searchPage.getResultPageHeader();

    }


    @Given("^user is on the home page to search for the product$")
    public void userIsOnTheHomePageToSearchForTheProduct() {
        homePage.getHomePageUrl();

    }

    @When("^user type 'nike' to search for product$")
    public void userTypeNikeToSearchForProduct() {
        homePage.dosearch("nike");
    }


    @Then("^user should able to see all the nike products$")
    public void userShouldAbleToSeeAllTheNikeProducts() {
        homePage.getResultPageHeader();
    }
}
