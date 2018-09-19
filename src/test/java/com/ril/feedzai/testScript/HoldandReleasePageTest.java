package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.HoldandReleasePage;

public class HoldandReleasePageTest extends FeedzaiTestBaseClass{
	HoldandReleasePage holdreleasepage;
	
	
	
	public HoldandReleasePageTest() throws IOException {
		super();

		
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void HRTest() throws Exception {
		logger.info("Moved to Hold & Release Page");
		holdreleasepage =new HoldandReleasePage();
		holdreleasepage.viewTransaction();
		Thread.sleep(4000);
		logger.info("Clicked on transaction view");
		
	}
	
	@Test(priority = 51,description = "Mark Suspicious")
	public void Suspicious() throws Exception{
		logger1 = extent.createTest("Mark Suspicious");
		holdreleasepage.markSuspicious();
		Thread.sleep(3000);
		logger.info("Transaction marked suspicious successfully");
	}
	
	@Test(priority = 52,description = "Mark Not Fraud")
	public void NotFraud() throws Exception{
		logger1 = extent.createTest("Mark Not Fraud");
		holdreleasepage.markAsNotFraud();
		Thread.sleep(3000);
		logger.info("Transaction marked Not fraud successfully");
	}
	
/*  @AfterMethod
	public JPB_Advance_Search JAS() {
		return new JPB_Advance_Search(); 
	} */
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}