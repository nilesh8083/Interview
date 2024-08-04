package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{

	
	public static void actionsClick(WebElement wb)
	{
		
		new Actions(driver).click(wb).build().perform();
		
	}
	
	
	public static void actionsSendKeys(WebElement wb, String value)
	{
		
		new Actions(driver).sendKeys(wb,value).build().perform();
		
	}
	
}
