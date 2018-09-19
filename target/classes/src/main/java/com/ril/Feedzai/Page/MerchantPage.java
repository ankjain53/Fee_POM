package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class MerchantPage extends FeedzaiTestBaseClass{
	
	@FindBy(xpath=".//*[@id='navbar']/ul/li[3]/a")
	WebElement AMMERCHANTTab;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/input")
	WebElement AMEnterMERCHANTMNo;
	
	@FindBy(xpath="html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div")
	WebElement AMSelectMer;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 col-sm-8 col-xs-8 merchant-details']")
	WebElement AMVerifyMerchDetails;
	
	@FindBy(xpath="//div[@class='widget-stage details fdz-css-height-400']")
	WebElement AMVerifyMerchLoaction;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div/div[2]")
	WebElement AMVerifyMerchTransaction;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[2]")
	WebElement AMVerifyTransactionStatics;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[2]")
	WebElement AMVerifyCustomerStatics;

	public MerchantPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickMerchantTab() throws Exception{
		AMMERCHANTTab.click();
		Thread.sleep(2000);
		
	}
	
	public void EnterMerchantNo() throws Exception {
		AMEnterMERCHANTMNo.sendKeys(pro.getProperty("MerNumber"));
		Thread.sleep(3000);
		AMSelectMer.click();
		Thread.sleep(2000);
		
	}
	
	public String VerifyMerchantDetail() throws Exception {
		Thread.sleep(1000);
		return AMVerifyMerchDetails.getText();
		
	
	}
	
	public String VerifyMerLocation() throws Exception {
		return AMVerifyMerchLoaction.getText();
	
	}
	
	public String VerifyMerchTransaction() throws Exception {
		return AMVerifyMerchTransaction.getText();
	
	}
	
	public String VerifyTransactionStatics() throws Exception {
		return AMVerifyTransactionStatics.getText();
	
	}
	
	public String verifyCustomerStatics() throws Exception {
		return AMVerifyCustomerStatics.getText();
	
	}
	
	
	public void EnterMerchantID() throws Exception {
		AMEnterMERCHANTMNo.sendKeys(pro.getProperty("MID"));
		Thread.sleep(3000);
		AMSelectMer.click();
		Thread.sleep(2000);
		
	}
	
	/*public AgentPage Agent() throws IOException {
		return new AgentPage();
	} */
	
	public AlertPage Merpage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		return new AlertPage(); 
}
}
