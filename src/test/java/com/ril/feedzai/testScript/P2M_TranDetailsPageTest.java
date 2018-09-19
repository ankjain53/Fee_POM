package com.ril.feedzai.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.P2M_TranDetailsPage;

public class P2M_TranDetailsPageTest  extends FeedzaiTestBaseClass {
	P2M_TranDetailsPage p2mTrans;

	public P2M_TranDetailsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void P2M() throws Exception {
		logger.info("Moved To P2M Transaction Page");
		p2mTrans = new P2M_TranDetailsPage();
	}
	 
@Test(priority=75 , description="Validate P2M transaction details in Alert Manager")
	public void P2M_Tran() throws Exception{
		logger1 = extent.createTest("Validate P2M transaction details in Alert Manager ");
		p2mTrans.P2M_Tran_Data();
		logger.info("Viewed P2M transaction ");
}

@Test(priority=76 , description="Validate customer id & Mobile number in P2M transaction ")
public void Customer_Data() throws Exception{
	logger1 = extent.createTest("Validate customer id & Mobile number in P2M transaction");
	 String cust_id =p2mTrans.P2M_Customer_Data();
	  System.out.println("Customer id ="+ cust_id);
	  if(cust_id.equals("Unknown") ) {
		  logger.info("Customer id not Present");
		  Assert.fail("Customer id not found for customer on customer details section");
	  }else {
		  logger.info("Customer id is Present");
	  }
	  Thread.sleep(2000);
	  String mob=p2mTrans.P2M_cust_app_id();
	  System.out.println("Customer Mobile number ="+ mob);
	  if(mob.equals("Unknown")) {
		  logger.info("Mobile Number is not Present");
		  Assert.fail("Customer mobile number not found for customer on customer details section");
	  }else {
		  logger.info("Mobile Number is  Present");
	  }
	  Thread.sleep(2000);
}	 
     
@Test(priority=77 , description="Validate customer app id in P2M transaction")
public void Cust_app_id() throws Exception{ 
	logger1 = extent.createTest("Validate customer app id in P2M transaction");  
	String cust_app=p2mTrans.P2M_cust_app_id();
	  System.out.println("Customer App id ="+ cust_app);
	  if(cust_app.equals("Unknown")) {
		  logger.info("Customer app id is not Present");
		  Assert.fail("Customer app id not found for customer on transaction details section");
	  }else {
		  logger.info("Customer app id is Present");
	  }
	  Thread.sleep(2000);
}

@Test(priority=79 , description="Validate Merchant app id in P2M transaction")
public void P2M_merchant_app_id() throws Exception{ 
    logger1 = extent.createTest("Validate merchant app id in P2M transaction");  
     String merchant_app_id=p2mTrans.P2M_merchant_app_id();
	  System.out.println("Merchant app id="+ merchant_app_id);
	  if(merchant_app_id.equals("Unknown")) 
	  {
		  logger.info("Merchant app id is not Present");
		  Assert.fail("Merchant app id not found in transaction on transaction details section");
	  }else {
		  logger.info("Merchant app id is Present");
		  
	  }
	  Thread.sleep(2000);
		
}


@AfterClass
public AlertPageTest Alertp() throws Exception {
	return new AlertPageTest();
}
}