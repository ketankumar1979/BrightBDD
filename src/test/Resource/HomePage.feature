Feature: Search

  @smoke
  Scenario: Search for individual product
    Given user is on the home page to search for the product
    When user type 'nike' to search for product
    Then user should able to see all the nike products


  Scenario Outline: Search  for multiple products
    Given user is on the home page
    When user search for "<products>"
    Then user should able to see all the products
    Examples:
    |products|
    |nike    |
    |puma    |


    #facebook login scenario outline
  @facebook
  Scenario Outline: facebook login
    Given user is on the home page of Facebook
    When user types "<username>" and "<password>"
    Then user should able to login successfully
    Examples:
    |username|password|
    |ketan   |patel   |
    |Tia  |Patel      |




