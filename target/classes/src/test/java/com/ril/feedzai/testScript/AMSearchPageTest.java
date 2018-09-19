package com.ril.feedzai.testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AMSearchPage;

public class AMSearchPageTest extends FeedzaiTestBaseClass{
	AMSearchPage amsearchpage;
	
	public AMSearchPageTest() throws IOException {
		super();

		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void Search() throws IOException {
		logger.info("Moved to AM Search Page");
		amsearchpage =new AMSearchPage();
	}
	
	@BeforeMethod
	public void SearchTab() throws Exception {
		amsearchpage.clickSearchTab();
		Thread.sleep(4000);
	}
	
	
	@Test(priority=36 , description="Customer ID Verification")
	public void CustSearch() throws Exception{
		logger1 = extent.createTest("Customer ID Verification");
		String CustId=amsearchpage.SearchCustID();
		assertTrue(CustId.contains(pro.getProperty("CustID")));
		Thread.sleep(4000);
		 logger.info("Customer ID Verified");
	}
	
	@Test(priority=37 , description="Merchant ID Verification")
	public void MerSearch() throws Exception{
		logger1 = extent.createTest("Merchant ID Verification");
		String MerId=amsearchpage.SearchMerID();
		assertTrue(MerId.contains(pro.getProperty("MerchantID")));
		Thread.sleep(4000);
		 logger.info("Merchant ID Verified");
	}
	
	@Test(priority=38 , description="Channel Search Verification")
	public void ChannelSearch() throws Exception{
		logger1 = extent.createTest("Channel Search Verification");
		String Channel=amsearchpage.AdvanceSearchChannel();
		assertTrue(Channel.contains(("P2M")));
		Thread.sleep(4000);
		 logger.info("Channel Search Verified");
	} 
	
	@Test(priority=39 , description="Agent ID Verification")
	public void AgentIDSearch() throws Exception{
		logger1 = extent.createTest("Agent ID Verification");
		String Agentid=amsearchpage.AdvanceSearchAgentID();
		assertTrue(Agentid.contains(pro.getProperty("AGENTID")));
		Thread.sleep(4000);
		 logger.info("Agent ID Verified");
	}
	
	@Test(priority=40 , description="Customer Number Verification")
	public void CusNumSearch() throws Exception{
		logger1 = extent.createTest("Customer Number Verification");
		String CusNo=amsearchpage.AdvanceSearchCusNum();
		assertTrue(CusNo.contains(pro.getProperty("CustPhoneNumber")));
		Thread.sleep(4000);
		logger.info("Customer Number Verified");
	}
	
	@Test(priority=41 , description="Merchant Number Verification")
	public void MerNumSearch() throws Exception{
		logger1 = extent.createTest("Merchant Number Verificatio");
		String MerNo=amsearchpage.AdvanceSearchMerNum();
		assertTrue(MerNo.contains(pro.getProperty("MerchantPhoneNum")));
		Thread.sleep(4000);
		logger.info("Merchant Number Verified");
	}
	
	@Test(priority=42 , description="Src InstID Verification")
	public void SrcInstIDSearch() throws Exception{
		logger1 = extent.createTest("Src InstID Verification");
		String SrcId=amsearchpage.AdvanceSearchSrcInstID();
		assertTrue(SrcId.contains(pro.getProperty("SourceInstID")));
		Thread.sleep(4000);
		logger.info("Src InstID Verified");
	}
	
	@Test(priority=43 , description="Response Code Verification")
	public void ResponseCodeSearch() throws Exception{
		logger1 = extent.createTest("Response Code Verification");
		String ResCode=amsearchpage.AdvanceSearchResponseCode();
		assertTrue(ResCode.contains(pro.getProperty("ResponseCode")));
		Thread.sleep(4000);
		logger.info("Response Code Verified");
	}  
	
	@Test(priority=44 , description="Process Code Verification")
	public void ProcessCodeSearch() throws Exception{
		logger1 = extent.createTest("Process Code Verification");
		String ProcessCode=amsearchpage.AdvanceSearchProcessCode();
		assertTrue(ProcessCode.contains(pro.getProperty("ProcessingCode")));
		Thread.sleep(4000);
		logger.info("Process Code Verified");
	}
	
	@Test(priority=45 , description="Hashed Card Verification")
	public void HashedCardPanSearch() throws Exception{
		logger1 = extent.createTest("Hashed Card Verification");
		String Hashcard=amsearchpage.AdvanceSearchHashedCardPan();
		assertTrue(Hashcard.contains(pro.getProperty("Hashed_Card_pan")));
		Thread.sleep(4000);
		logger.info("Hashed Card Pan Verified");
	}
	
	
	@Test(priority=46 , description="CustAppID Verification")
	public void CustAppIDSearch() throws Exception{
		String AppId=amsearchpage.AdvanceSearchCustAppID();
		assertTrue(AppId.contains(pro.getProperty("CustomerAppID")));
		Thread.sleep(4000);
		logger.info("CustAppID Verified");
	} 
	
	@Test(priority=47 , description="Sender Pan Verification")
	public void SenderPanSearch() throws Exception{
		logger1 = extent.createTest("Sender Pan Verification");
		String Pan=amsearchpage.AdvanceSearchSenderPan();
		assertTrue(Pan.contains(pro.getProperty("SenderPan")));
		Thread.sleep(4000);
		logger.info("Sender Pan Verified");
	}
	
	@Test(priority=48 , description="Card Bin Verification")
	public void CardBinSearch() throws Exception{
		logger1 = extent.createTest("Card Bin Verification");
		String Cardbin=amsearchpage.AdvanceSearchCardBin();
		assertTrue(Cardbin.contains(pro.getProperty("CardBin")));
		Thread.sleep(4000);
		logger.info("Card Bin Verified");
	}
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}

