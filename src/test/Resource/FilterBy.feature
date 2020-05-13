Feature: filtered products

  Background:
    Given user is on the home page to search for the product
    When user type 'nike' to search for product
    Then user should able to see all the nike products
    Given user is on result page
    When user clicks on £5 - £10 pricerange
    Then user should able to see all the items inside that price range

    @smoke
  Scenario: Add to trolley the filtered £5 - £10  product

    Given user is on the filtered products page
    When user wants to click to  one of the £5 - £10 product to add to trolley
    Then user should be able to add selected product in the trolley