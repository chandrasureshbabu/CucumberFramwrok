package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.core.plugin.RerunFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\BugzillaLogin_usingDifferentLogins.feature",glue = {"Steps"},
monochrome = true,dryRun = false,stepNotifications = true,
plugin = {"pretty","html:target/cucumber.html","json:target/cucus.json","junit:target/cucus.junit",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})


public class TestRunner {

}
