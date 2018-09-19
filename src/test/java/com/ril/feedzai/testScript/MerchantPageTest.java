package com.ril.feedzai.testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AgentPage;
import com.ril.Feedzai.Page.MerchantPage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class MerchantPageTest extends FeedzaiTestBaseClass  {
	MerchantPage merpage;
	
	public MerchantPageTest() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void MerchantTab() throws Exception{
	logger1 = extent.createTest("Merchant Detail Verification");
	logger.info("On Merchant Page");
	merpage=new MerchantPage();
	merpage.ClickMerchantTab();
}
	@Test(priority = 27, description = "ENTER MERCHANT MOBILE Number")
	public void MerchantDeatilsMno() throws Exception{
		logger1 = extent.createTest("Merchant MOBILE Number Verification");
		merpage.EnterMerchantNo();
		String MerDetail=merpage.VerifyMerchantDetail();
		logger.info("MerchantDetailCaptured");
		assertTrue(MerDetail.contains(pro.getProperty("MerNumber")));
		assertTrue(MerDetail.contains(pro.getProperty("MID")));
		Thread.sleep(1000);
		TakeScreenshot.captuerScreenshot(driver, "Merchant Detail");
		String MerLoaction=merpage.VerifyMerLocation();
		System.out.println(MerLoaction);
		Thread.sleep(1000);
		String MerTran=merpage.VerifyMerchTransaction();
		System.out.println(MerTran);
		Thread.sleep(1000);
		String MerTranStats=merpage.VerifyTransactionStatics();
		System.out.println(MerTranStats);
		Thread.sleep(1000);
		String CusStats=merpage.verifyCustomerStatics();
		System.out.println(CusStats);
		Thread.sleep(2000);
		TakeScreenshot.captuerScreenshot(driver, "Merchant Tran Detail");
		logger.info("Merchant Details Verified with Mobile number");
	}
	
	@Test(priority = 28, description = "ENTER MERCHANT MOBILE ID")
	public void MerchantDeatilsID() throws Exception{
		logger1 = extent.createTest("Merchant ID Verification");
		merpage.ClickMerchantTab();
		Thread.sleep(2000);
		merpage.EnterMerchantID();
		String MerDetail2=merpage.VerifyMerchantDetail();
		logger.info("MerchantDetailCaptured");
		assertTrue(MerDetail2.contains(pro.getProperty("MerNumber")));
		assertTrue(MerDetail2.contains(pro.getProperty("MID")));
		TakeScreenshot.captuerScreenshot(driver, "Merchant Detail");
		logger.info("Merchant Details Verified with ID");
	}
	
	/*@AfterClass
	public AgentPageTest AgentT() throws IOException {
	return new AgentPageTest();
} */
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}