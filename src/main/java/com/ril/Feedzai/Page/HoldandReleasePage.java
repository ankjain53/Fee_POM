package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class HoldandReleasePage extends FeedzaiTestBaseClass{
	

	@FindBy(xpath="//input[@id='fdz-form-transaction-id']")
	WebElement ClickonTrans;

	@FindBy(xpath="//button[@class='btn button-warning button-sm action-suspicious']")
	WebElement MarkSusp;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement EnterObs;
	
	@FindBy(xpath="//div[@class='select2-container select-min-width-200 fdz-js-marks-as-suspicious']")
	WebElement ChooseQueue;
	
	@FindBy(xpath="//div[contains(text(),'JPB')]")
	WebElement ChoosefromQueue;
	
	@FindBy(xpath="//button[contains(text(),'Suspicious')]")
	WebElement SuspiciousButton;
	
	@FindBy(xpath="//div[@data-growl='container']")
	WebElement MyAlertSuccess;
	
	@FindBy(xpath="//button[contains(text(),'Not Fraud')]")
	WebElement NotFraudButton;
	

	@FindBy(xpath="//a[@href='#search']")
	WebElement SearchTab;
	
	@FindBy(xpath="//input[@id='fdz-form-date-time']")
	WebElement Search_date;
	
	@FindBy(xpath="//button[@type='button'][contains(text(),'Done')]")
	WebElement Clear_txt;

	@FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
	WebElement TranView;
	
	@FindBy(xpath="//button[@title='Mark as Not Fraud']")
	WebElement MarkNotFraud;
		
			
	public HoldandReleasePage()  throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void viewTransaction() throws Exception
	{
		SearchTab.click();
		Thread.sleep(5000);
		Search_date.clear();
		Clear_txt.click();
	 	Thread.sleep(4000);
		ClickonTrans.sendKeys(pro.getProperty("RRN"));
		ClickonTrans.sendKeys(Keys.ENTER);
		TranView.click();
		TakeScreenshot.captuerScreenshot(driver, "Transaction view");
	}
	
	public void markSuspicious() throws Exception{
		MarkSusp.click();
		Thread.sleep(1000);
		EnterObs.sendKeys(pro.getProperty("Fraud_Observation2"));
		Thread.sleep(1000);
		ChooseQueue.click();
		Thread.sleep(1000);
		ChoosefromQueue.click();
		SuspiciousButton.click();
		TakeScreenshot.captuerScreenshot(driver, "Transaction marked suspicious successfully");
	}
	
	public void markAsNotFraud() throws Exception{
		MarkNotFraud.click();
		
		EnterObs.sendKeys(pro.getProperty("Fraud_Observation1"));
		Thread.sleep(1000);
		NotFraudButton.click();
		TakeScreenshot.captuerScreenshot(driver, "Transaction marked not fraud");
	}
	
/*	public JPB_AdvanceSearchPage JAD() {
		return new JPB_AdvanceSearchPage();
	} */
	public AlertPage Merpage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		return new AlertPage(); 
}
}
