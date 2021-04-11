package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private final WebDriver driver;
    private final By carCheckOutButton;
    private final By firstNameInput;
    private final By lastNameInput;
    private final By zipCodeInput;
    private final By continueButton;
    private final By checkOutButton;

    public CartPage(WebDriver driver){
        this.driver = driver;
        carCheckOutButton = By.xpath("//a[@class='shopping_cart_link']");
        checkOutButton = By.xpath("//*[@id='checkout']");
        firstNameInput = By.xpath("//*[@id='first-name']");
        lastNameInput = By.xpath("//*[@id='last-name']");
        zipCodeInput = By.xpath("//*[@id='postal-code']");
        continueButton = By.xpath("//*[@id='continue']");

    }

    public void checkOutProducts(){
        driver.findElement(carCheckOutButton).click();
    }

    public void checkOutCart(){
        driver.findElement(checkOutButton).click();
    }

    public void fillOutTheForm(String name, String lastName, String zip) {
        driver.findElement(firstNameInput).sendKeys(name);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(zipCodeInput).sendKeys(zip);
    }

    public void clickToContinue(){
        driver.findElement(continueButton).click();
    }

}
