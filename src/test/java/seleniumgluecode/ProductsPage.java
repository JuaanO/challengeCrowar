package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsPage extends TestBase{

    @Given("^I log in with the standard user\\.$")
    public void iLogInWithTheStandardUser() {
        loginPage.fillOutRequiredFields("standard_user", "secret_sauce");
        loginPage.loginUser();
    }

    @When("^I sort products by price, high to low\\.$")
    public void iSortProductsByPriceHighToLow() {
        inventaryPage.sortProductsPriceLh();

    }

    @Then("^the first price is higher than the second price\\.$")
    public void theFirstPriceIsHigherThanTheSecondPrice() {
        inventaryPage.orderPriceLowHigh();

    }

    @When("^I sort products by price, low to high\\.$")
    public void iSortProductsByPriceLowToHigh() {
        inventaryPage.sortProductsPriceHl();
    }

    @Then("^the first price is lower than the second price\\.$")
    public void theFirstPriceIsLowerThanTheSecondPrice() {
        inventaryPage.orderPriceHighLow();
    }

    @When("^I sort products in alphabetical order\\.$")
    public void iSortProductsInAlphabeticalOrder() {
        inventaryPage.sortProductsNameZa();
    }

    @Then("^the sorted products are in alphabetical order\\.$")
    public void theSortedProductsAreInAlphabeticalOrder() {
        inventaryPage.orderNameZa();
    }

    @When("^I sort products in reverse alphabetical order\\.$")
    public void iSortProductsInReverseAlphabeticalOrder() {
        inventaryPage.sortProductsNameAz();
    }

    @Then("^the sorted products are in reverse alphabetical order\\.$")
    public void theSortedProductsAreInReverseAlphabeticalOrder() throws Throwable {
        inventaryPage.orderNameAz();
    }
}
