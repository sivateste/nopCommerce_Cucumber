package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "Features/Customers.feature",
		glue="stepDefinations",
		dryRun=false,
		monochrome=true,
		tags= {"@tag ,@tag1"},
		plugin= {"pretty","html:test-output"}
		
		)

public class TestRun {

}
