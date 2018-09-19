package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.LMW_TranDetailsPage;

public class LMW_TranDetailsPageTest extends FeedzaiTestBaseClass {
	LMW_TranDetailsPage lmwTrans;

	public LMW_TranDetailsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void LMW() throws Exception {
		logger.info("Moved To LMW Transaction Page");
		lmwTrans = new LMW_TranDetailsPage();
	}
	
	@Test(priority=63 , description="Validate LMW transaction details in Alert Manager")
	public void LMW_TranData() throws Exception{
		logger1 = extent.createTest("Validate P2M transaction details in Alert Manager ");
		lmwTrans.P2M_Tran_Data();
		logger.info("Viewed LMW transaction ");
	}
	
	@Test(priority=64 , description="Validate card details in LMW transaction ")
	public void LMW_Instrument_details() throws Exception{
		logger1 = extent.createTest("Validate card details in LMW transaction");
		String instrument_dt=lmwTrans.LMW_Instrument_details();
		System.out.println("Customer Instrument Details ="+ instrument_dt);
		if(instrument_dt.equals("Unknown") ) {
			logger.info("Customer Card details not displayed");
			Assert.fail("Card details not found in instrument details section for IBW transaction");
		}else {
			logger.info("Customer Card details displayed");
		}
	
	String hashed_dt=lmwTrans.LMW_Hashed_details();
	System.out.println("Customer Hashed card Details ="+ hashed_dt);
	if(hashed_dt.equals("Unknown")) {
		logger.info("Hashed Card details not displayed");
		Assert.fail("Hashed card details not found in instrument details section for IBW transaction");
	}else {
		logger.info("Hashed Card details displayed");
	}

}
	@Test(priority=65 , description="Validate customer app id in LMW transaction")
	public void LMW_CustomerMob() throws Exception{
		logger1 = extent.createTest("Validate customer app id in LMW transaction");
		String cust_app_lmw=lmwTrans.LMW_Customer_dt();
		System.out.println("Customer Mobile number ="+ cust_app_lmw);
		if(cust_app_lmw.equals("Unknown")) {
			logger.info("Customer app id is not Present");
			Assert.fail("Customer app id details not found for customer on transaction details page ");
		}else {
			logger.info("Customer app id is Present");
		}

	}



	@Test(priority=66 , description="Validate Source Institution ID in LMW transaction")
	public void LMW_transaction_details() throws Exception{
		logger1 = extent.createTest("Validate Source Institution ID in LMW transaction");
		String sid=lmwTrans.LMW_transaction_details();
		System.out.println("Source Institution ID ="+ sid);

		if(sid.equals("Unknown")) {
			logger.info("Source Institution ID id is not Present");
			Assert.fail("Source Institution ID not found for transaction in transaction details section");

		}else {
			logger.info("Source Institution ID id is Present");
		}

	}
	
	@AfterClass
	public AlertPageTest Alertp() throws Exception {
		return new AlertPageTest();
	}
	


	}

	

