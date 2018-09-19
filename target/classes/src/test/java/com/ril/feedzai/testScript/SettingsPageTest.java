package com.ril.feedzai.testScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AgentPage;
import com.ril.Feedzai.Page.SettingsPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class SettingsPageTest extends FeedzaiTestBaseClass {
	SettingsPage setpage;
	
	public SettingsPageTest() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	} 

	@BeforeClass
	public void Setting() throws Exception {
		logger1 = extent.createTest("Setting Tab Selection");
		logger.info("On Settings Page");
		setpage=new SettingsPage();
		
	}
	
	@Test(priority=32,description="Verify Alert IN Queue_SETTINGS")
	public void SettingTab() throws Exception{
		logger1 = extent.createTest(" Alert Verification in Queue_SETTINGS");
	setpage.ClickOnSettings();
	 TakeScreenshot.captuerScreenshot(driver, "Settings");
	 logger.info("Settings Tab selected");
	 String Date=setpage.QueueDate();
	 System.out.println(Date);
	 Thread.sleep(2000);
	 String BenfId=setpage.BenID();
	 System.out.println(BenfId);
	 Thread.sleep(3000);
	 logger.info("Settings Tab Working as expected");
	 }

/*	@AfterClass
	public ReportPageTest ReportT() throws IOException {
	return new ReportPageTest();
} */
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}
