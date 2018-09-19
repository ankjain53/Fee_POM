package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class CustomerPage extends FeedzaiTestBaseClass{
	
	//OR for customerSearch
		@FindBy(xpath="//*[@class='glyphicon glyphicon-user']")
		WebElement CustomerTab;
		
		//OR for custMobNumSearch
		@FindBy(xpath="//input[@placeholder='Search for a Customer']")
		WebElement SearchForCust;
		
		@FindBy(xpath="//div[@data-selectable='']")
		WebElement getCustomer;
		
		//OR for custNameValidate
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
		WebElement Expected_CustDetail;
		
		//OR for custIDValidate
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[2]")
		WebElement Cust_TransactionDensity;
		
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
		WebElement Cust_ActivityPeriod;
		
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
		WebElement Cust_TransDetail;
				
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]")
		WebElement Cust_FraudDetail;
		
		@FindBy(xpath="html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]")
		WebElement Expected_AppID;
		
		@FindBy(xpath="//div[@class='col-md-8 customer-details']")
		WebElement CustomerDetails;
		
		@FindBy(xpath="//div[@class='col-md-6 customer-transaction']")
		WebElement Transaction_statistics;
		
		@FindBy(xpath="//div[@class='col-md-6 customer-merchant']")
		WebElement Merchant_statistics;
		
		@FindBy(xpath="//div[@class='col-md-12 customer-history']")
		WebElement Cust_TransactionHistory;
		
	
	 public CustomerPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	 public void customerSearch() throws Exception{
		 CustomerTab.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 public void custMobNumSearch() throws Exception{
	 SearchForCust.sendKeys(pro.getProperty("CustMobNum"));
	 Thread.sleep(2000);
	 getCustomer.click();
	 Thread.sleep(3000);
	 
	 }
	 
	 public void custIdSearch() throws Exception{
		 CustomerTab.click();
		 Thread.sleep(3000);
		 SearchForCust.sendKeys(pro.getProperty("CustID"));
		 Thread.sleep(2000);
		 getCustomer.click();
		 Thread.sleep(3000);
	 }
	 
	 public String custNameValidate() throws Exception{
		 return Expected_CustDetail.getText();
		 
		 
	 }
	 
	 public String custIDValidate() throws Exception{
		 Thread.sleep(1000);
		 return Cust_TransactionDensity.getText();
	 }
	 
	 public String custAccNumValidate() throws Exception{
		 Thread.sleep(500);
		 return Cust_ActivityPeriod.getText();
		 
	 }
	 
	 public String custKycValidate() throws Exception{
		 Thread.sleep(1000);
		 return Cust_TransDetail.getText();
	 }
	 
	 public String custStatusValidate() throws Exception{
		 Thread.sleep(500);
		 return Cust_FraudDetail.getText();
		 
	 }
	 
	 public String custAppIDValidate() throws Exception{
		 Thread.sleep(500);
		 return Cust_TransactionHistory.getText();
	 }
	 
	 
	 public boolean custTransStatisticsValidate() throws Exception{
		 Thread.sleep(500);
		 return Transaction_statistics.isDisplayed();
	 }
	 
	 
	 public boolean custMerchStatisticsValidate() throws Exception{
		 Thread.sleep(1000);
		 return Merchant_statistics.isDisplayed();
	 }
	 
	 /*	public MerchantPage Merpage() throws IOException, InterruptedException {
			Thread.sleep(2000);
			return new MerchantPage(); */
			
				public AlertPage Merpage() throws IOException, InterruptedException {
				Thread.sleep(2000);
				return new AlertPage(); 
		}
				 
				 
}
