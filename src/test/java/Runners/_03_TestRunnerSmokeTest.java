package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import java.util.Locale;
@CucumberOptions(
    tags = "@SmokeTest",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepsDefinitions"},
    plugin= {"html:target/site/cucumber-smokeTest-reports.html" }
)
public class _03_TestRunnerSmokeTest extends AbstractTestNGCucumberTests {

}
