package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/features"},
			glue = {"def"},
			monochrome = true,
			dryRun = false,
			plugin = {"pretty", "html: report/myreport.html"},
			tags = ("@Negative")
		)
public class TestRun {

}
