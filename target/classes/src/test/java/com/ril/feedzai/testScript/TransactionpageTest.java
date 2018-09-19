package com.ril.feedzai.testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AlertPage;
import com.ril.Feedzai.Page.Transactionpage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class TransactionpageTest extends FeedzaiTestBaseClass{
	Transactionpage transpage;
	
	public TransactionpageTest() throws IOException {
		super();
		 
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void SelectTrans() throws InterruptedException, IOException {
		logger1 = extent.createTest("Transaction Tab Selected");
		logger.info("Moved to Transaction Page");; 
		transpage =new Transactionpage();
		Thread.sleep(3000);
		transpage.ViewTransaction();
	
	}
	
	@Test(priority = 20,description = "Mark Transaction Not Fraud")
	public void markTransNotFraud() throws Exception {
		logger1 = extent.createTest("Transaction Marked Not Fraud");
		transpage.MARKTransactionNOTFRAUD();
		TakeScreenshot.captuerScreenshot(driver, "Transaction Marked Not Fraud");
		String Transtatus=transpage.VerifyTransType();
		assertTrue(Transtatus.contains("Not Fraud"));
		logger.info("Transaction marked Not Fraud"); 
		
	}
	
	@Test(priority = 21,description = "Mark Transaction Fraud")
	public void markTransFraud() throws Exception {
		logger1 = extent.createTest("Transaction MarkedFraud");
		transpage.MARKTransactionFRAUD();
		TakeScreenshot.captuerScreenshot(driver, "Transaction Marked Fraud");
		String Transtatus1=transpage.VerifyTransType();
		assertTrue(Transtatus1.contains("Fraud"));
		logger.info("Transaction marked Fraud"); 
		transpage.MARKTransactionNOTFRAUD();
		Thread.sleep(2000);
	}
	
		@AfterClass
		public AlertPageTest Alert() throws IOException {
			return new AlertPageTest();
			
		}

		/*	@AfterClass
		public AlertPageTest alert() throws IOException {
		logger.info("Moved to alertpage");
		return new AlertPageTest();  */
		
		
		
	}

