package runners;  // Ensure this matches your package structure

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Feature.LocalApi.feature", // <- update this to the real path
    glue = {"Stepdefination", "utils"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json"
    },
    monochrome = true
)


public class TestRunnerTest {
}




