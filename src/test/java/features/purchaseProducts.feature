Feature: Purchase a product - Challenge Crowdar

  As a valid user I want to login successfully to Saucedemo web page,
  and verify that it works properly.

  @PurchaseProduct
  Scenario: Buy a product successfully
    Given a valid user on the login page of Saucedemo
    When the user fill out required fields
    And the user press login
    And the user add a product to cart and press checkout
    And the user fill out the form and press finish
    Then the user can see the message of successfully checkout
