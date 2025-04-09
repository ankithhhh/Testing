package runners;  // Ensure this matches your package structure

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature",  // Update this path to where your feature files actually are
    glue = {"Stepdefination", "utils"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    dryRun = false,  // Change to false to actually run the tests
    monochrome = true
)
public class TestRunner {
}


public class TestRunner {
}




