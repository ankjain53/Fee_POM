package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class JPB_CustomerSearchPage extends FeedzaiTestBaseClass{
	
	@FindBy(xpath="//a[@href='#customer']")
	WebElement CustomerTab;
	
	@FindBy(xpath="//input[@id='fdz-customer-jpb']")
	WebElement JPB_Radio;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement SearchForCust1;
	
	@FindBy(xpath="//div[@data-value='4000000451']")
	WebElement click_customer;
	
	@FindBy(xpath="//html//div[@class='col-md-8 customer-details']/div[1]")
	WebElement Customer_details;
	
	@FindBy(xpath="//table[@class='fdz-css-color-rows']")
	WebElement Account_dt;
	
	@FindBy(xpath="//table[@class='fdz-css-color-rows widget-stage details fdz-css-fatty']")
	WebElement Activity_tab;
	
	@FindBy(xpath="//html//div[@class='col-md-8 customer-details']/div[4]/div[2]")
	WebElement Tran_details;
	
	@FindBy(xpath="//div[@class='col-md-8 customer-details']//div[@class='widget-wrapper last-child']")
	WebElement Fraud_dt;
	
	@FindBy(xpath="//div[@class='widget-stage details fdz-css-height-400']")
	WebElement Tran_density;
	
	@FindBy(xpath="//button[@class='btn button-default button-sm status-log']")
	WebElement Cust_status_log;
	
	@FindBy(xpath="//button[@type='submit'][@class='button button-primary']")
	WebElement Cust_Status_log_Src;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]")
	WebElement Status_tran_dt;
	
	@FindBy(xpath="//input[@placeholder='Search for a Customer']")
	WebElement close;
	
	@FindBy(xpath="//div[@class='col-md-6 customer-transaction']")
	WebElement Tran_statistic;
	
	@FindBy(xpath="//div[@class='col-md-12 customer-history']")
	WebElement Tran_history;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement JM_cust_Search;
	
	@FindBy(xpath="//div[@data-value='1100205989']")
	WebElement JM_cust_dt;
	
	@FindBy(xpath="//html//div[@class='col-md-8 customer-details']/div[1]/div[2]")
	WebElement JM_cust_details;



	public JPB_CustomerSearchPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void Customer_Search_CIFID() throws Exception{
		CustomerTab.click();
		logger.info("Clicked on Customer Tab");
		JPB_Radio.click();
		Thread.sleep(4000);
		SearchForCust1.sendKeys(pro.getProperty("Customer_id1"));
		logger.info("Entered Customer ID");
		Thread.sleep(6000);
		click_customer.click();	

	}
	

	public String Customer_Details_CIFID() throws Exception{
		return Customer_details.getText();

	}
	
	public void Customer_Details_Account_Number() throws Exception{
		CustomerTab.click();
		logger.info("Clicked on Customer Tab");
		JPB_Radio.click();
		logger.info("Clicked on JPB Radio button");		
		Thread.sleep(4000);
		SearchForCust1.sendKeys(pro.getProperty("Account_number1"));
		logger.info("Entered Customer ID");
		Thread.sleep(6000);
		click_customer.click();	
	
	} 
	

	public String Customer_Details_Account_Details() throws Exception{
		return Account_dt.getText();
		
	} 


	public String Activity_Period() throws Exception{
	 return	Activity_tab.getText();
	} 

	public String Transactions_Details() throws Exception{
		return Tran_details.getText();

	} 
	
	public String Fraud_Details() throws Exception
	{
		return Fraud_dt.getText();
	}
	
	public boolean Tran_density() throws Exception
	{
		return Tran_density.isDisplayed();
		
	}
	
	public boolean transaction_Statistic() throws Exception
	{
		return Tran_statistic.isDisplayed();
	}
	
	public String transaction_History() throws Exception{
		return Tran_history.getText();
	}
	
	public boolean Status_Log_Details() throws Exception{
		return Status_tran_dt.isDisplayed();
		
	}
	
	public String JM_Customer_Search() throws Exception{
		close.click();
		JM_cust_Search.sendKeys(pro.getProperty("JM_ID"));
		Thread.sleep(2000);
		JM_cust_dt.click();
		return JM_cust_details.getText();
	}
	
	
	public AlertPage HR() throws Exception{
		return new AlertPage();

	}
	
	

}
