package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.CustomerPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class CustomerPageTest extends FeedzaiTestBaseClass {
	CustomerPage custpage;
	
	public CustomerPageTest() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void Custsearch() throws Exception{
		logger1 = extent.createTest("Customer search");
		logger.info("Moved On Customer Page");
	   custpage = new CustomerPage();
		custpage.customerSearch();
	}
	
	@Test(priority = 22,description = "Customer Search through mobile number")
	public void CustMobSearch() throws Exception{
		logger1 = extent.createTest("Customer Search through mobile number");
		custpage.custMobNumSearch();
		logger.info(" Customer Searched via mobile number");
	}
	
	@Test(priority = 23,description = "Customer Search through ID")
	public void custIdSearch() throws Exception{
		logger1 = extent.createTest("Customer Search through ID");
		custpage.custIdSearch();
		logger.info("Clicked On Customer Search tab");
		TakeScreenshot.captuerScreenshot(driver, "Customer Search tab");
		
	}
	
	@Test(priority = 24,description = "Customer Detail Verification")
	public void CustDetailInfo() throws Exception{
		logger1 = extent.createTest("Customer Detail Verification");
		String Custid=custpage.custIDValidate();
		System.out.println(Custid);
		logger.info("Custid Found");
		
		String CustAccNum=custpage.custAccNumValidate();
		System.out.println(CustAccNum);	
		logger.info("CustAccNum Found");
		TakeScreenshot.captuerScreenshot(driver, "Customer Account No");
		
		String CustKyc=custpage.custKycValidate();
		System.out.println(CustKyc);
		logger.info("CustKyc Found");
		
		String CustStatus=custpage.custStatusValidate();
		System.out.println(CustStatus);
		logger.info("CustStatus Found");
		
		String CustAppId=custpage.custAppIDValidate();
		System.out.println(CustAppId);
		logger.info("CustAppId Found");
		TakeScreenshot.captuerScreenshot(driver, "Customer App Id");
		
		boolean CustTransStatistics = custpage.custTransStatisticsValidate();
		Assert.assertTrue(CustTransStatistics,"Customer Transaction Statistics graph is not displayed");
		logger.info("Customer Transaction Statistics graph is displayed ");
		
		boolean CustMerchStatistics = custpage.custMerchStatisticsValidate();
		Assert.assertTrue(CustMerchStatistics,"Merchant Statistics graph in Customer tab is not displayed");
		Thread.sleep(3000);
		logger.info("Merchant Statistics graph in Customer tab is  displayed ");
		TakeScreenshot.captuerScreenshot(driver, "CustomerStatistics Displayed");
		
	}

	
	/*@AfterClass
	public MerchantPageTest Merchant() throws IOException {
		return new MerchantPageTest();
		
	} */
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
	}