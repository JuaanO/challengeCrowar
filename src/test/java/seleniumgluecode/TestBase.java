package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    pages.LoginPage loginPage = new pages.LoginPage(driver);
    pages.InventaryPage inventaryPage = new pages.InventaryPage(driver);

}
