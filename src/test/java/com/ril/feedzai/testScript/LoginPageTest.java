package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AlertPage;

import com.ril.Feedzai.Page.LoginPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class LoginPageTest extends FeedzaiTestBaseClass {
	LoginPage loginpage;
  AlertPage alertpage;
 //  HomePage homepage ;
	
	public LoginPageTest() throws IOException {
	super(); 
		
	}
	
	@BeforeSuite
	public void setup() throws IOException {
		Initializedriver();
		 loginpage =new LoginPage();
		 
	}

	
	@Test(priority=1,description="Verify Page Title & User Login")
	
	public void VerifyUserLogin() throws Exception{
		 logger1 = extent.createTest("Login to Feedzai AM");
		String PageTitle=loginpage.VerifyPageTitle();
		Assert.assertEquals(PageTitle, "Reliance Alert Manager");
		TakeScreenshot.captuerScreenshot(driver, "Feedzai AM Login Page");
		alertpage=loginpage.PerformsignUp(pro.getProperty("MyUserName"),pro.getProperty("MyPassword"));
		//homepage=loginpage.PerformsignUp(pro.getProperty("MyUserName"),pro.getProperty("MyPassword"));
		logger.info("LoginPage Executed Successfully"); 
		
		
	}
	
	@AfterMethod
	public AlertPageTest Alert() throws IOException  {
		return new AlertPageTest(); //returns objects of ALertPageTest Class
		
	
	} 

}
