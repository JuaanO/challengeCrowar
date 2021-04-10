package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends TestBase{


    @Given("^a valid user on the login page of Saucedemo$")
    public void aValidUserOnTheLoginPageOfSaucedemo() {
        loginPage.assertionLoginPage();
    }

    @When("^the user fill out required fields$")
    public void theUserFillOutRequiredFields() {
        loginPage.fillOutRequiredFields("standard_user", "secret_sauce");
    }

    @When("^the user press login$")
    public void theUserPressLogin() {
        loginPage.loginUser();
    }

    @Then("^the user can see the products page$")
    public void theUserCanSeeTheProductsPage() {
        loginPage.assertionProductsPage();
    }

    @Given("^a invalid crentials try login to Saucedemo$")
    public void aInvalidCrentialsTryLoginToSaucedemo() {
        loginPage.fillOutRequiredFields("standard_user", "bad_secret");
    }

    @Then("^the user can see the alert of error$")
    public void theUserCanSeeTheAlertOfError() {
        loginPage.assertionLoginError();
    }

    @Given("^a bloked user to login$")
    public void aBlokedUserToLogin() {
        loginPage.fillOutRequiredFields("locked_out_user", "secret_sauce");
    }

    @Then("^the user can see the alert of blocked user$")
    public void theUserCanSeeTheAlertOfBlockedUser() {
        loginPage.assertionLoginError();
    }

}
