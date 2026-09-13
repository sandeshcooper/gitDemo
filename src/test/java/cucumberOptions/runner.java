package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions"
                 ,   monochrome = true, dryRun = false,
                plugin = {"pretty","html:target/cucumberReports.html"})
public class runner extends AbstractTestNGCucumberTests {
}
