Feature: Products - Challenge Crowdar

  As a user,
  I want to use the Saucedemo web application sorting features,
  So that I can verify their functionality.

  @OrderProducts
  Scenario: Sorting products by price, high to low is working.
    Given I log in with the standard user.
    When I sort products by price, high to low.
    Then the first price is higher than the second price.

  @OrderProducts
  Scenario: Sorting products by price, low to high is working.
    Given I log in with the standard user.
    When I sort products by price, low to high.
    Then the first price is lower than the second price.

  @OrderProducts
  Scenario: Sorting products in alphabetical order is working.
    Given I log in with the standard user.
    When I sort products in alphabetical order.
    Then the sorted products are in alphabetical order.

  @OrderProducts
  Scenario: Sorting products in reverse alphabetical order is working.
    Given I log in with the standard user.
    When I sort products in reverse alphabetical order.
    Then the sorted products are in reverse alphabetical order.