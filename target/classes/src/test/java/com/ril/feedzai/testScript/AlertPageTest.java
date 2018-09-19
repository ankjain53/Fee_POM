package com.ril.feedzai.testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AlertPage;
import com.ril.Feedzai.Utility.TakeScreenshot;


public class AlertPageTest extends FeedzaiTestBaseClass {
	AlertPage alertpage;
	//LoginPage loginpage;
	//HomePage homepage ;
	//AlertPageTest alertpagetest;
	// TransactionpageTest transpageT;
	

	public AlertPageTest() throws IOException {
		super();
		
	}
	
	@BeforeClass
	public void SelectAlert() throws InterruptedException, IOException {
		
		logger.info("Moved To AlertPage "); 
		alertpage =new AlertPage();
		alertpage.SelectAlert();
		
	}

	@Test(priority = 2,description = "Mark Alert Not Fraud")
	public void MarkNotFraud() throws Exception {
		logger1 = extent.createTest("Mark Alert Not Fraud");
		alertpage.MarkAlertNotFraud();
		TakeScreenshot.captuerScreenshot(driver, "Alert Marked Not Fraud");
	//	String AlertCheck=alertpage.VerifyNotFraudTitle();
		//assertTrue(AlertCheck.contains("Not Fraud"));
		
		logger.info("ALert sucessfully Marked As Not Fraud"); 
		
	} 
	
	@Test(priority = 3,description = "Mark Alert Fraud")
	public void MarkFraud() throws Exception {
		logger1 = extent.createTest("Mark Alert Fraud");
		alertpage.MarkAlertFraud();
		TakeScreenshot.captuerScreenshot(driver, "Alert Marked Fraud");
	//	String AlertCheck2=alertpage.VerifyNotFraudTitle();
	//	assertTrue(AlertCheck2.contains("Fraud"));;
		logger.info("ALert sucessfully Marked As Fraud"); 
		
	}
	
	@Test(priority = 4,description = "Mark Alert Suspicious")
	public void MarkSuspicious() throws Exception {
		logger1 = extent.createTest("Mark Alert Suspicious");
		alertpage.MarkAlertSuspicious();
		TakeScreenshot.captuerScreenshot(driver, "Alert Marked Suspicious");
	//	String AlertCheck3=alertpage.VerifyNotFraudTitle();
	//	assertTrue(AlertCheck3.contains("Suspicious"));
		logger.info("ALert sucessfully Marked As Suspicious");  
		Thread.sleep(2000);
		alertpage.MarkAlertNotFraud();
	
}  
	
	@Test(priority = 5,description = "Transaction Page Test")
	public TransactionpageTest Trans() throws IOException{
		return new TransactionpageTest(); 
	} 
	
	@Test(priority = 6,description = "Customer Page Test")
	public CustomerPageTest Cust() throws IOException{
		return new CustomerPageTest(); 
	} 
	
	@Test(priority = 7,description = "Merchant Page Test")
	public MerchantPageTest Mer() throws IOException{
		return new MerchantPageTest(); 

	}
	
	@Test(priority = 8,description = "Agent Page Test")
	public AgentPageTest Agent() throws IOException{
		return new AgentPageTest(); 

	}
	
	@Test(priority = 9,description = "Transaction Page Test")
	public SettingsPageTest Setting() throws IOException{
		return new SettingsPageTest(); 

	}
	
	@Test(priority = 10,description = "Report Page ")
	public ReportPageTest report() throws IOException{
		return new ReportPageTest(); 

	}
	
	@Test(priority = 11,description = "AMSearch Page ")
	public AMSearchPageTest Amsea() throws IOException{
		return new AMSearchPageTest(); 

	}
	
	@Test(priority = 12,description = "HoldandRelease Page ")
	public HoldandReleasePageTest HoldRel() throws IOException{
		return new HoldandReleasePageTest(); 

	}
	
	@Test(priority = 13,description = "JBP_AdvanceSearch Page ")
	public JBP_AdvanceSearchPageTest JbpSearch() throws Exception{
		return new JBP_AdvanceSearchPageTest(); 

	} 
	
	@Test(priority = 14,description = "JPB_CustomerSearch Page ")
	public JPB_CustomerSearchPageTest JbpCust() throws Exception{
		return new JPB_CustomerSearchPageTest();
	} 

	@Test(priority = 15,description = "LMW_TranDetail Page ")
	public LMW_TranDetailsPageTest LMWTran() throws Exception{
		return new LMW_TranDetailsPageTest();
	} 
	
	@Test(priority = 16,description = "MPP_TranDetail Page ")
	public MPP_TranDetailsPageTest MPP() throws Exception{
		return new MPP_TranDetailsPageTest();
	} 
	
	@Test(priority = 17,description = "IBW_TranDetail Page ")
	public IBW_TranDetailsPageTest IBW() throws Exception{
		return new IBW_TranDetailsPageTest();
	}

	@Test(priority = 18,description = "P2M_TranDetails Page")
	public P2M_TranDetailsPageTest P2M() throws Exception{
		return new P2M_TranDetailsPageTest();
	} 

	@Test(priority = 19,description = "Beneficiary Pan Test")
	public BeneficiaryPan_ValidationPageTest BenPan() throws Exception{
		return new BeneficiaryPan_ValidationPageTest();
	} 


	@AfterClass
	//@Test(priority = 19,description = "Beneficiary Pan Test")
	public FeedzaiPulseHomePageTest pulseh() throws IOException{
		return new FeedzaiPulseHomePageTest();
		
		
	} 
	
	
	
	
	
	/*@AfterClass
	public TransactionpageTest feedzaiTranc() throws IOException {
		return new TransactionpageTest();
	} 
	
		@AfterClass
	public HomePageTest feedzaiTranc() throws IOException {
		return new HomePageTest();
	}  */
}

