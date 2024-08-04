package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/java/AllFeatures",
		glue = "StepDefination" , 
		dryRun = false,
		monochrome = true,
		
		plugin= 
			{"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
