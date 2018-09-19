package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.JBP_AdvanceSearchPage;

public class JBP_AdvanceSearchPageTest extends FeedzaiTestBaseClass {
	JBP_AdvanceSearchPage jbpAdvsearch;
	
	public JBP_AdvanceSearchPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void JBP_AdvanceSearch() throws Exception {
		logger.info("Moved to JBP Advance Search");
		jbpAdvsearch =new JBP_AdvanceSearchPage();
		jbpAdvsearch.AdvanceSearchSetup();
		Thread.sleep(2000);
	}
	
	
	@BeforeMethod(description="JPB Advanced Search ")
	public void JBPAdvanceSearch() throws Exception{
		jbpAdvsearch.Advance_Search();
	}
	
	
	@Test(priority=53,description="JPB Advanced Search Sender PAN")
	public void JBPSender_pan() throws Exception {
		logger1 = extent.createTest("JPB Advanced Search Sender PAN");
		String span=jbpAdvsearch.Sender_pan();
		Assert.assertTrue(span.contains(pro.getProperty("Sender_PAN_no")));
		logger.info("JPB Sender pan detail is displayed ");	
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	@Test(priority=54,description="JPB Advanced Search Beneficiary PAN")
	public void Beneficiary_pan() throws Exception{
		logger1 = extent.createTest("JPB Advanced Search Beneficiary PAN");
		String Bpan=jbpAdvsearch.Beneficiary_pan();
		System.out.println("Sender pan Details are =" +Bpan);
		Assert.assertTrue(Bpan.contains(pro.getProperty("Beneficiary_PAN_no")));
		logger.info("JPB Beneficiary pan detail is displayed ");	
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	@Test(priority=55,description="JPB Advanced Search Sender MMID ")
	public void Sender_MMID() throws Exception{
		logger1 = extent.createTest("JPB Advanced Search Sender MMID ");
        String SMMID=jbpAdvsearch.Sender_MMID();
		System.out.println("Sender pan Details are =" +SMMID);
		Assert.assertTrue(SMMID.contains(pro.getProperty("Sender_MMID_1")));
		logger.info("JPB Sender MMID detail are displayed ");	
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	@Test(priority=56,description="JPB Advanced Search Beneficiary MMID ")
	public void Beneficiary_MMID() throws Exception{
		logger1 = extent.createTest("JPB Advanced Search Beneficiary MMID ");
		String BMMID=jbpAdvsearch.Beneficiary_MMID();
		System.out.println("Sender pan Details are =" +BMMID);
		Assert.assertTrue(BMMID.contains(pro.getProperty("Benef_MMID")));
		logger.info("JPB Beneficiary MMID detail is displayed ");	
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
		
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}
