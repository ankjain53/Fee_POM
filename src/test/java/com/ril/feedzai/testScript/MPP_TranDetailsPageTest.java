package com.ril.feedzai.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.MPP_TranDetailsPage;

public class MPP_TranDetailsPageTest extends FeedzaiTestBaseClass {
	MPP_TranDetailsPage mppTrans;

	public MPP_TranDetailsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void MPP() throws Exception {
		logger.info("Moved To Verifying MPP Transaction");
		mppTrans = new MPP_TranDetailsPage();
	}
	
	@Test(priority=67 , description="Validate MPP transaction details in Alert Manager")
	public void MPP_Tran() throws Exception{
		logger1 = extent.createTest("Validate MPP transaction details in Alert Manager ");
		mppTrans.MPP_Tran_Data();
		logger.info("Viewed MPP transaction ");
	}

	@Test(priority=68 , description="Validate Merchant terminal id & device id in MPP transaction")
	public void Customer_dt() throws Exception{
		logger1 = extent.createTest("Validate Merchant terminal id & device id in MPP transaction");
		  String tid_1 =mppTrans.MPP_Customer_dt();
		  System.out.println("Customer terminal id ="+ tid_1);
		  if(tid_1.equals("Unknown") ) {
			  logger.info("Merchant terminal is not present");
			  Assert.fail("Merchant terminal id is not found in merchant details section");
		  }else {
			  logger.info("Merchant terminal is present");
		  }
		  Thread.sleep(2000);
		   
		 
		  String div_id=mppTrans.MPP_Device_dt();
		  System.out.println("Customer device id ="+ div_id);
		  if(div_id.equals("Unknown")) {
			  logger.info("Device id is not Present");
			  Assert.fail("Customer device id not found in transaction details section");
		  } else{
			  logger.info("Device id is Present");
		    }
	
	}
	@Test(priority=69 , description="Validate customer card details in MPP transaction ")
	public void Card_dt() throws Exception{
		logger1 = extent.createTest("Validate customer card details in MPP transaction");
		  String mpp_card_dt=mppTrans.MPP_Card_dt();
		  System.out.println("Customer Card Details ="+ mpp_card_dt);
		  if(mpp_card_dt.equals("Unknown")) {
			  logger.info("Customer card detail is not Present");
			  Assert.fail("Customer card details not found for customer in instrument details section");
		  }else {
			  logger.info("Customer card detail is Present");
		  }
		  Thread.sleep(2000);
	}
	
	@Test(priority=70 , description="Validate SID in MPP transaction ")
	public void transaction_dt() throws Exception
	{
		 logger1 = extent.createTest("Validate SID in MPP transaction");
			  String sid=mppTrans.MPP_transaction_dt();
			  System.out.println("MPP Source Institution ID ="+ sid);
			  if(sid.equals("Unknown")) 
			  {
				  logger.info("MPP:Source Institution ID is not present");
				  Assert.fail("SID not found for MPP transaction in transaction details section");	 
				
			  }else {
				  logger.info("MPP:Source Institution ID is present");
			  }
			  Thread.sleep(2000);
				
		}
	
	@AfterClass
	public AlertPageTest Alertp() throws Exception {
		return new AlertPageTest();
	}
	
		
	}
