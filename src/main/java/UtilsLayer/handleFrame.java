package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class handleFrame extends BaseClass {

	public static void frame(WebElement wb)
	{
		
	driver.switchTo().frame(wb);
		
	}
}
