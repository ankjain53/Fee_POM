package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.IBW_TranDetailsPage;

public class IBW_TranDetailsPageTest extends FeedzaiTestBaseClass {
	IBW_TranDetailsPage IbwTrans;

	public IBW_TranDetailsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void IBW() throws Exception {
		logger.info("Moved To IBW Transaction Page");
		IbwTrans = new IBW_TranDetailsPage();
	}

	@Test(priority=71 , description="Validate IBW transaction details in Alert Manager")
	public void IBW_Tran() throws Exception
	{
		IbwTrans.IBW_Tran_Data();
		logger.info("Viewed IBW transaction ");
	}

	@Test(priority=72, description="Customer id in IBW transaction")
	public void Customer_Details() throws InterruptedException {
		logger1 = extent.createTest("Validate IBW transaction details in Alert Manager ");
		String cust_id =IbwTrans.IBW_Customer_Details();
		System.out.println("Customer id ="+ cust_id);
		if(cust_id.equals("Unknown") ) {
			logger.info("Customer id not Present");
			Assert.fail("Customer id not found in customer details section for IBW transaction");
		}else {
			logger.info("Customer id is Present");
		}

		  Thread.sleep(2000);

		String mob=IbwTrans.IBW_Customer_MNo();
		System.out.println("Customer Mobile number ="+ mob);
		if(mob.equals("Unknown")) {
			logger.info("Mobile Number is not Present");
			Assert.fail("Mobile number not found in customer details section for IBW transaction");
		}else {
			logger.info("Mobile Number is  Present");
		}
         Thread.sleep(2000);
	}
	
	@Test(priority=73, description="Validate Payment Details in IBW transaction")
	public void Payment_Details() throws InterruptedException {
		logger1 = extent.createTest("Validate Payment Details in IBW transaction");
		String bill_details=IbwTrans.IBW_Payment_Details();
		System.out.println("Customer bill details ="+ bill_details);
		if(bill_details.equals("Unknown")) {
			logger.info("Customer bill detail is not Present");
			Assert.fail("Customer bill detail not found in payment details section for IBW transaction");
		}else {
			logger.info("Customer bill detail is Present");
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=74, description="Validate SID in IBW transaction")
	public void transaction_Details() throws InterruptedException {
		logger1 = extent.createTest("Validate SID in IBW transaction");
		String sid=IbwTrans.IBW_transaction_Details();
		System.out.println("Source Institution ID="+ sid);
		if(sid.equals("Unknown")) 
		{
			logger.info("IBW:Source Institution ID is not present");
			Assert.fail("SID not found in transaction details section for IBW transaction");

		}else {
			logger.info("IBW:Source Institution ID is present");
		}
		
		Thread.sleep(2000);

		String cust_app_id=IbwTrans.IBW_cust_appid();
		System.out.println("Customer app id="+ cust_app_id);
		if(cust_app_id.equals("Unknown")) 
		{
			logger.info("Customer app id is not present");
			Assert.fail("Customer app id not found in transaction details section for IBW transaction");

		}else {
			logger.info("Customer app id is present");
		}
		Thread.sleep(2000);

	}

	@AfterClass
	public AlertPageTest Alertp() throws Exception {
		return new AlertPageTest();
	}


}
