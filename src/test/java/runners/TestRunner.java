package runners;  // Ensure this matches your package structure

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/LocalApi.feature",
    glue = {"Stepdefination", "utils"},
    plugin = {"pretty"},
    dryRun = true,
    monochrome = true
)



public class TestRunner {
}




