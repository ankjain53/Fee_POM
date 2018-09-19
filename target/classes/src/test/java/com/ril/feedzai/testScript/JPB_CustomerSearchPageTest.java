package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.JPB_CustomerSearchPage;



public class JPB_CustomerSearchPageTest extends FeedzaiTestBaseClass {
	JPB_CustomerSearchPage jpbCustsearch;

	public JPB_CustomerSearchPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void JpbcustSear() throws IOException {
		jpbCustsearch = new JPB_CustomerSearchPage();
		
		
	}
	
	@Test(priority=57,description="JPB Profile Search with Customer_number")
	public void JBP_SearchCIFID() throws Exception{
		logger1 = extent.createTest("JPB Profile Search with Customer_number");
		jpbCustsearch.Customer_Search_CIFID();
		logger.info("Clicked on customer Details");
	}
	
	@Test(priority=58,description="JPB Customer Details")
	public void Customer_Details_CIFID() throws Exception{
		logger1 = extent.createTest("JPB Customer Details");
		 String CustDetail=jpbCustsearch.Customer_Details_CIFID();
		 Thread.sleep(3000);
		 System.out.println("Customer Details are =" +CustDetail);
			Assert.assertTrue(CustDetail.contains("Neeraj Jain"));
			logger.info("JPB Customer name details displayed ");
			Assert.assertTrue(CustDetail.contains(pro.getProperty("Customer_id1")));
			logger.info("JPB Customer details displayed ");
			Assert.assertTrue(CustDetail.contains("8446974489"));
			logger.info("JPB Mobile number details displayed ");
			Assert.assertTrue(CustDetail.contains("2"));
			logger.info("JPB customer risk details displayed ");	
}
	

	@Test(priority=59,description="JPB Profile Search with Account_number")
	public void Customer_Account_Number() throws Exception{
		logger1 = extent.createTest("JPB Customer activity period details");
		jpbCustsearch.Customer_Details_Account_Number();
		logger.info("Clicked on customer Details");
		
	}
	
	@Test(priority=60,description="JPB Account Details")
	public void Customer_Account_Details() throws Exception{
		logger1 = extent.createTest("JPB Account Details");
		String Acc_det=jpbCustsearch.Customer_Details_Account_Details();
		System.out.println("Account details of customer =" + Acc_det);
		Thread.sleep(3000);
		Assert.assertTrue(Acc_det.contains(pro.getProperty("Account_number1")));
		logger.info("JPB account number displayed ");
		Assert.assertTrue(Acc_det.contains("CDMZK6620B"));
		logger.info("JPB Customer POI ID displayed ");
		Assert.assertTrue(Acc_det.contains("146172627164"));
		logger.info("JPB POA details displayed ");
		Assert.assertTrue(Acc_det.contains("PAN"));
		logger.info("JPB POA Name displayed ");	
		
	}
	
	@Test(priority=61,description="JPB Account Details")
	public void VerifyAlldetail() throws Exception{
		logger1 = extent.createTest("JPB Cust Verify all Account Details");
		String act=jpbCustsearch.Activity_Period();
		System.out.println("Customer activity period details =" + act);
		//Thread.sleep(2000);
		logger.info("JPB Cust Activity Period Verified");
		
		String td=jpbCustsearch.Transactions_Details();
		System.out.println("Customer transactions Details =" + td);
		//Thread.sleep(2000);
		logger.info("JPB Cust Transactions Details Verified");
		
		String Fraud_dt=jpbCustsearch.Fraud_Details();
		System.out.println("Customer Fraud Details =" + Fraud_dt);
		logger.info("JPB Cust Fraud Details Verified");
		
		Boolean my_element=jpbCustsearch.Tran_density();
		Assert.assertTrue(my_element,"Customer Density graph is not displayed"); 	
		logger.info("JPB Customer Density graph is displayed ");
		
		Boolean my_element2 =jpbCustsearch.transaction_Statistic();
		Assert.assertTrue(my_element2,"Customer Statistics graph is not displayed");
		logger.info("JPB Customer transaction Statistic is displayed ");
		
		String Hist=jpbCustsearch.transaction_History();
		Assert.assertTrue(Hist.contains(pro.getProperty("Customer_id1")));
		logger.info("JPB Customer History is displayed ");
		
		Boolean my_element4=jpbCustsearch.Status_Log_Details();
		Assert.assertTrue(my_element4,"Customer transaction History is not displayed");
		logger.info("JPB Customer transaction History is displayed ");

		String jpb_jm=jpbCustsearch.JM_Customer_Search();
		System.out.println("Sender pan Details are =" +jpb_jm);
		Assert.assertTrue(jpb_jm.contains(pro.getProperty("JM_ID")));
		logger.info("Jio Money Customer  History is displayed ");
	
	}
	
	@AfterClass
	public AlertPageTest Alertpage() throws Exception {
		return new AlertPageTest();
	}
	
}
