package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class utilsClass extends BaseClass{

	static WebDriverWait wait;
	public static void visbilityOfElement(WebElement wb)
	{
		wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	public static void click(WebElement wb)
	{
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).click();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
		
	}
	public static String getAttribute(WebElement wb)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).getAttribute("value");
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	public boolean  isDisplayed(WebElement wb)
	{
		if (wb.isDisplayed()&&wb.isEnabled())
		{
			System.out.println(wb.getText()+"is Displayed and is Enable");
		}
		return true;
		
	}
	
	
	
	
}
