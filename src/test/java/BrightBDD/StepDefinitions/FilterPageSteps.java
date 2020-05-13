package BrightBDD.StepDefinitions;

import BrightBDD.PageObject.FilterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterPageSteps {

    FilterPage filterPage = new FilterPage();

    @Given("^user is on the filtered products page$")
    public void user_is_on_the_filtered_products_page()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user wants to click to  one of the £(\\d+) - £(\\d+) product to add to trolley$")
    public void user_wants_to_click_to_one_of_the_£_£_product_to_add_to_trolley(int arg1, int arg2)  {
        filterPage.clickOnPriceRangeItem();
    }

    @Then("^user should be able to add selected product in the trolley$")
    public void user_should_be_able_to_add_selected_product_in_the_trolley()  {
        // Write code here that turns the phrase above into concrete actions
    }
}
