package seleniumgluecode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseProducts extends TestBase{

    @When("^the user add a product to cart and press checkout$")
    public void theUserAddAProductToCartAndPressCheckout() {
        inventaryPage.addProducttoCart("Sauce Labs Onesie");
        cartPage.checkOutProducts();
        cartPage.checkOutCart();
    }

    @When("^the user fill out the form and press finish$")
    public void theUserFillOutTheFormAndPressFinish() {
        cartPage.fillOutTheForm("Juan Jose", "Estrella", "12666");
        cartPage.clickToContinue();
        checkoutPage.clickFinish();

    }

    @Then("^the user can see the message of successfully checkout$")
    public void theUserCanSeeTheMessageOfSuccessfullyCheckout() {

        checkoutPage.assertOrder();
    }

}
