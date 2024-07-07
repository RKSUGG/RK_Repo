package com.mystore.actiondriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	
	
	public void TestBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void Button(WebElement element) {
		element.click();
		
	}
	
	
	

}
