package com.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;

public class TC_LoginPage extends BaseClass{
	LoginPage lp;
	
	public TC_LoginPage() {
		super();
	}
	
	@Test
	public void login() {
		lp=new LoginPage(driver);
		try {
			lp.login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
