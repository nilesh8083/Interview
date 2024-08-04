package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.ContactUs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps extends BaseClass{

	
	public static ContactUs page;
	
	@When("User click on the Contact Us link,")
	public void user_click_on_the_contact_us_link() {

		page =new ContactUs();
				page.clickContactFunctionality();
	}

	@When("click on Marketing link User enter Full name , organisation Name ,phone Number, Email,Job role")
	public void click_on_marketing_link_user_enter_full_name_organisation_name_phone_number_email_job_role() {

		page.marketingFuctionality("Nilesh Mudgade ", " veltuz", "901282890", "nilesh@gmail", "Management");
	}

	@Then("click on agree and click On submit button")
	public void click_on_agree_and_click_on_submit_button() {
		
		page.clickContactFunctionality();
		System.err.println("Test case is fail");
		
	    
	}
	
}
