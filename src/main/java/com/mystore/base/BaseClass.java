package com.mystore.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	@BeforeClass
	public void setUp() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileInputStream FI=new FileInputStream(System.getProperty("user.dir")+"./Configurators/config.properties");
		prop=new Properties();
		prop.load(FI);
		driver.get(prop.getProperty("Application.url"));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit();
	}
	
	
	

}
