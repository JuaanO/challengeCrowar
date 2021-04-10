package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage {

    private WebDriver driver;

    private final By userField;
    private final By passwordField;
    private final By loginButton;
    private final By assertionProducts;
    private final By assertionLogin;
    private final By assertionError;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        userField = By.xpath("//*[@id='user-name']");
        passwordField = By.xpath("//*[@id='password']");
        loginButton = By.xpath("//*[@id='login-button']");
        assertionLogin = By.xpath("//*[@id='login_credentials']/h4");
        assertionProducts = By.xpath("//span[contains(text(),'Products')]");
        assertionError = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    }
    public void fillOutRequiredFields(String user, String pass){
        driver.findElement(userField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);

    }

    public void loginUser(){
        driver.findElement(loginButton).click();
    }

    public void assertionLoginPage(){

        Assert.assertTrue(driver.findElement(assertionLogin).getText().contains("Accepted usernames"));

    }

    public void assertionProductsPage(){

        Assert.assertEquals("PRODUCTS", driver.findElement(assertionProducts).getText());

    }

    public void assertionLoginError(){

        Assert.assertTrue(driver.findElement(assertionError).getText().contains("do not match any user in this service"));

    }


    public void assertionLoginBlockedUser(){

        Assert.assertTrue(driver.findElement(assertionError).getText().contains("has been locked out"));

    }

}

