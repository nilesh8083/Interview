package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.utilsClass;

public class HomePage extends BaseClass {

	
	@FindBy(xpath="//a[text()='Our Story ']")
	WebElement ourStory;
	
	@FindBy(xpath="//a[text()='Our Solution ']")
	WebElement ourSolution;
	
	
	@FindBy(xpath="//a[text()='Why Tendable? ']")
	WebElement whyTendable;
	
	@FindBy(xpath="//a[text()='Request a Demo']")
	WebElement requestDemoButton;
	
	public HomePage()
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void HomePageFuctionality()
	
	{
		utilsClass.isDisplayed(ourStory);
		utilsClass.isDisplayed(ourSolution);
		utilsClass.isDisplayed(whyTendable);
		utilsClass.isDisplayed(requestDemoButton);
	}
	
	
}
