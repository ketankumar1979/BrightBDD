package BrightBDD.StepDefinitions;

import BrightBDD.PageObject.ResultPage;
import BrightBDD.PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultPageSteps {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Given("^user is on home page$")
    public void userIsOnHomePage() {

    }

    @When("^user search for a product$")
    public void userSearchForAProduct() {
        homePage.dosearch("nike");
    }


    @Given("^user on result page$")
    public void user_on_result_page()  {
    }

    @When("^user click on Running category$")
    public void user_click_on_Running_category()
    {
        resultPage.selectcategory();
    }

    @Then("^user can see all products related to Running category$")
    public void user_can_see_all_products_related_to_Running_category()
    {
        // Write code here that turns the phrase above into concrete actions
    }

    //£5 - £10 pricerange scenario


    @Given("^user is on result page$")
    public void userIsOnResultPage() {

    }

    @When("^user clicks on £(\\d+) - £(\\d+) pricerange$")
    public void userClicksOn££Pricerange(int arg0, int arg1) {
     resultPage.priceCheckBox();
    }

    @Then("^user should able to see all the items inside that price range$")
    public void userShouldAbleToSeeAllTheItemsInsideThatPriceRange() {
    }



}
