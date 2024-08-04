package StepDefination;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {

	static HomePage home;

	@When("User open url in {string} browser")
	public void user_open_url_in_browser(String browsername) {

		BaseClass.intializtion(browsername);

	}

	@Then("Verify the Home, Our Story, Our Solution,Why Tendable, Request button")
	public void verify_the_home_our_story_our_solution_why_tendable_request_button() {
		home = new HomePage();
		home.HomePageFuctionality();
	}


	@AfterStep
	public static void tearDown(Scenario scenario) throws InterruptedException {
		Thread.sleep(4000);
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] b = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(b, "image/png", scenario.getName());
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] b = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(b, "image/png", scenario.getName());
		}
	}

}
