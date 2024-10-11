package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Featurefiles"}, // Correct path to the feature files
        glue = "Steps", // Package for step definitions
        plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:target/cucumber-reports.html",   // Cucumber HTML report
                "json:target/cucumber.json",           // Cucumber JSON report
                "testng:target/testng-cucumber-reports/testng-report.xml" }

)

public class Runner {
}
