Feature: category product
  As a user
  I want to select category of Running
  So that i can see all product related to Running

Background:
  Given user is on the home page to search for the product
  When user type 'nike' to search for product
  Then user should able to see all the nike products

  @regression
  Scenario: search for Running category products
    Given user on result page
    When user click on Running category
    Then user can see all products related to Running category

    @smoke
    Scenario: Click on £5 - £10 pricerange

      Given user is on result page
      When user clicks on £5 - £10 pricerange
      Then user should able to see all the items inside that price range

