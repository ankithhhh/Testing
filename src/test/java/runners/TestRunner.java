package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature",
    glue = {"Stepdefination", "utils"},  // Changed from "Stepdefination" to "stepdefinitions"
    plugin = {"pretty", "html:target/cucumber-reports"},
    dryRun = false,
    monochrome = true
)
public class TestRunner {
    // Empty class body
}
