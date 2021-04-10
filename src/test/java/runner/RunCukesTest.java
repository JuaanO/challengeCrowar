package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        format = {"json:target/cucumber/cucumber.json", "html:target/cucumber/cucumber.html"},
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"},
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
//        plugin = {"com.vimalselvam.cucumber.ExtentCucumberFormatter:/output/report.html"},
        snippets = SnippetType.CAMELCASE
)
public class RunCukesTest {

}