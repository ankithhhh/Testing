package runners;  // Ensure this matches your package structure

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/LocalApi.feature", // ✅ This matches your actual path
    glue = {"Stepdefination", "utils"}, 
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
    monochrome = true
)



public class TestRunner {
}




