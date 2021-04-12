Feature: login - Challenge Crowdar

  As a valid user I want to login successfully to Saucedemo web page,
  and verify that it works properly.

  @login
  Scenario: Login with a valid credentials
    Given a valid user on the login page of Saucedemo
    When the user fill out required fields
    And the user press login
    Then the user can see the products page

  @Login
  Scenario: Login with a invalid credentials
    Given a invalid crentials try login to Saucedemo
    When the user fill out required fields
    And the user press login
    Then the user can see the alert of error

  @Login
  Scenario: Login with a bloked user
    Given a bloked user to login
    When the user fill out required fields
    And the user press login
    Then the user can see the alert of blocked user
