package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AgentPage;
import com.ril.Feedzai.Page.MerchantPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AgentPageTest extends FeedzaiTestBaseClass  {
	AgentPage agentpage;
	
	public AgentPageTest() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	} 

	@BeforeClass
	public void AgentTab() throws Exception {
		logger1 = extent.createTest("Agent Tab selected");
		logger.info("On Agent Page");
		agentpage=new AgentPage();
		agentpage.ClickAgentTab();
		
	}
	
	@Test(priority = 30, description = "AGENT Detail Check")
	public void verifyAgentdetail() throws Exception{
	 logger1 = extent.createTest("AGENT Detail Verification");
	 agentpage.AgentSearch();
	 String AgentDetail=agentpage.AgentVerify();
	 System.out.println(AgentDetail);
	 agentpage.AgentCheckdetail();
	 TakeScreenshot.captuerScreenshot(driver, "Agent Detail");
	logger.info("Agent Details Verified");
		
		
	}
	
	/*@AfterClass
	public SettingsPageTest setTest() throws IOException {
		return new SettingsPageTest();
	} */
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
	
}
