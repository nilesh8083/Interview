package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.ActionClass;
import UtilsLayer.handleDropDown;
import UtilsLayer.utilsClass;

public class ContactUs extends BaseClass{

	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactLink;
	
//	@FindBy(xpath="//button[@data-target='.toggle-163701']")
//	WebElement marketingLink;
	
	@FindBy(xpath="(//button[text()='Contact'])[1]")
	WebElement marketingLink;
	
	@FindBy(id="form-input-fullName")
	WebElement EnterFullName;
	
	@FindBy(id="form-input-organisationName")
	WebElement organisationName;
	
	
	@FindBy(id="form-input-cellPhone")
	WebElement phone;
	
	@FindBy(id="form-input-email")
	WebElement Email;
	
	@FindBy(xpath="(//select[@name='jobRole'])[1]")
	WebElement jobRoleDropDown;
	
//	@FindBy(id="form-input-consentAgreed-0")
//	WebElement agree ;
//	
	@FindBy(xpath="(//button[text()='Submit'])[1]")
	WebElement submitButton;
	
	
	public ContactUs()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickContactFunctionality()
	{
		
		utilsClass.click(contactLink);
		//utilsClass.click(marketingLink);
		
		//new Actions(driver).click(marketingLink).build().perform();
		
		ActionClass.actionsClick(marketingLink);
	}
	
	public void marketingFuctionality(String fullName, String orgname, String Phone, String email, String value)
	{
		utilsClass.sendKeys(EnterFullName, fullName);
		utilsClass.sendKeys(organisationName, orgname);
		utilsClass.sendKeys(phone, Phone);
		utilsClass.sendKeys(Email, email);
		handleDropDown.selectByVisibleText(jobRoleDropDown, value);

		
//		ActionClass.actionsSendKeys(EnterFullName, fullName);
//		ActionClass.actionsSendKeys(organisationName, orgname);
//		ActionClass.actionsSendKeys(phone, Phone);
//		ActionClass.actionsSendKeys(Email, email);
//		handleDropDown.selectByVisibleText(jobRoleDropDown, value);
		
	}
	
	public void clickOnSubmit()
	{
		//utilsClass.click(agree);
		utilsClass.click(submitButton);
		
//		ActionClass.actionsClick(agree);
//		ActionClass.actionsClick(submitButton);
	}
	
	
}
