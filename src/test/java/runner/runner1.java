package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/feature/",
		glue = {"step"}

		)


public class runner1 extends AbstractTestNGCucumberTests{
	

}
