package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Selenium Automation\\CommerceCucumber\\Features\\Baselogin.feature", glue = {
				"stepDefinitions" }, monochrome = true, dryRun = false, plugin = { "pretty",
						"html:target/cucumber2-reports.html" }
// , tags = "@Login or @AddCustomer"
)

public class BaseRunner {

}
