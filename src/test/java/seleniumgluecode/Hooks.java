package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;

    @Before
    public void setUp() throws IOException, InterruptedException {

        numberOfCase ++;
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));
        System.out.println("Scenario: " +numberOfCase+ " is running ..");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("enableVNC", true);
        URL url = new URL(props.getProperty("urlSelenoid"));
        driver = new RemoteWebDriver(url,capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(props.getProperty("Saucedemo"));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report.
            scenario.embed(screenshot, "image/png");
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
