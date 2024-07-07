package com.mystore.pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.ReusableMethods;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	//public WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement username_Textbox;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password_Textbox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login_Button;
	
	 public LoginPage(WebDriver rdriver) {
		 driver=rdriver;
		PageFactory.initElements(driver, this);
	}

	public HomePage login() throws IOException {
		
		
		ReusableMethods RM=new ReusableMethods();
		RM.TestBox(username_Textbox, prop.getProperty("app.username"));
		RM.TestBox(password_Textbox, prop.getProperty("app.password"));
//		username_Textbox.sendKeys(prop.getProperty("app.username"));
//		password_Textbox.sendKeys(prop.getProperty("app.password"));
		RM.Button(Login_Button);
//		Login_Button.click();
		return new HomePage();
		
//		TestBox(username_Textbox, prop.getProperty("app.username"));
//		TestBox(password_Textbox, prop.getProperty("app.password"));
//		Button(Login_Button);
		
		
		
	}
	
	
	
	
}
