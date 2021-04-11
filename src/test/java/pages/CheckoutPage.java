package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private final WebDriver driver;
    private final By finishButton;
    private final By messageSuccessfullyOrder;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        finishButton = By.xpath("//*[@id='finish']");
        messageSuccessfullyOrder = By.xpath("//*[@id='checkout_complete_container']/h2");
    }

    public void clickFinish(){
        driver.findElement(finishButton).click();
    }

    public void assertOrder(){
        Assert.assertEquals(driver.findElement(messageSuccessfullyOrder).getText(), "THANK YOU FOR YOUR ORDER");
    }

}
