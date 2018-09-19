package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.ReportPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class ReportPageTest extends FeedzaiTestBaseClass {
	ReportPage report;
	
	public ReportPageTest() throws IOException {
		super();

		
		// TODO Auto-generated constructor stub
	}  
	
	@BeforeClass
	public void Feedzaireport() throws IOException {
		logger.info("On Reports Page");
		report =new ReportPage();
	}

	@Test(priority=33 , description="Check Reports")
	public void ReportCheck() throws Exception{
		logger1 = extent.createTest("Report Tab Validation");
		report.Report();
		TakeScreenshot.captuerScreenshot(driver, "Report");
		 logger.info("Report Tab selected");
	     Thread.sleep(2000);
		
	}
	
	/*@AfterClass
	public AMSearchPageTest AmsearchTest() throws IOException {
		return new AMSearchPageTest();
	} */
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}
