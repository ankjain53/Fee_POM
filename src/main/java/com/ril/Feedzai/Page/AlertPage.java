package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class AlertPage extends FeedzaiTestBaseClass {
	
	@FindBy(xpath="//div[@data-growl='container']")
	WebElement MyAlertSuccess;
	
	//OR for Select Alert
	@FindBy(xpath="//*[@id='navbar']/ul/li[3]/a")
	WebElement AMMERCHANTTab;
	

	@FindBy(xpath="//*[@id='navbar']/ul/li[1]/a")
	WebElement AlertTab;
	
	
	@FindBy(xpath="//html//th[2]/button[1]")
	WebElement Alert_Setting;
	
	@FindBy(xpath="//i[@class='fa fa-sort-amount-desc']")
	WebElement Alert_set_dec;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/thead/tr/th[5]/button/i")
	WebElement cust_Setting;	
	
	@FindBy(xpath="//*[@id=\"s2id_fdz-label-filterValue\"]/ul")
	WebElement cust_Text;
	
	
	@FindBy(xpath="//div[@id='s2id_fdz-label-filterValue']//input[1]")
	WebElement cust_TextEnter;
	
	
	//OR for Alert MArked as Not Fraud
	@FindBy(xpath="//i[@class='glyphicon glyphicon-ok']")
	WebElement MarkAlertNotFraud;
	
	@FindBy(xpath="//textarea[@placeholder='Enter observation.']")
	WebElement EnterYourObservation;
	
	@FindBy(xpath="//button[@class='button button-success action-not-fraud']")
	WebElement SelectNotFraud;
	
	//OR for Alert MArked as Fraud
	@FindBy(xpath="//i[@class='glyphicon glyphicon-remove']")
	WebElement MarkAlertFraud;
	
	@FindBy(xpath="//button[@class='button button-danger action-fraud']")
	WebElement SelectFraud;
	
	//OR for Alert MArked as Suspicious
	@FindBy(xpath="//i[@class='glyphicon glyphicon-fire']")
	WebElement MarkAlertSuspicious;

	@FindBy(xpath="//b[@role='presentation']")
	WebElement SuspiciousQueue;

	@FindBy(xpath="//div[@id='select2-drop']//input[1]")  //*[@id="s2id_autogen6_search"]
	WebElement MyQueueDetail;
	
	@FindBy(xpath="//button[@class='button button-warning action-suspicious']")
	WebElement FoundSuspicious;

	
	public AlertPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	public void SelectAlert() throws InterruptedException {
		AMMERCHANTTab.click();
		Thread.sleep(2000);
		AlertTab.click();
		Thread.sleep(5000);
		Alert_Setting.click();
		Alert_set_dec.click();
		Thread.sleep(1000);
		cust_Setting.click();
		cust_Text.click();
		Thread.sleep(1000);
		cust_TextEnter.sendKeys("1100000521");
		Thread.sleep(1000);
		cust_TextEnter.sendKeys(Keys.ENTER);
	}
	
	public void MarkAlertNotFraud() throws InterruptedException {

		MarkAlertNotFraud.click();
		Thread.sleep(2000);
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation"));
		SelectNotFraud.click();
		Thread.sleep(5000);
		
	}
	
	public String VerifyNotFraudTitle() {
	    return MyAlertSuccess.getText();
	}
	
	public void MarkAlertFraud() throws Exception{
		MarkAlertFraud.click();
		Thread.sleep(2000);
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation1"));
		Thread.sleep(1000);
		SelectFraud.click();
		Thread.sleep(5000);
	}
	
	public void MarkAlertSuspicious() throws Exception {
		MarkAlertSuspicious.click();
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation2"));
		Thread.sleep(2000);
		SuspiciousQueue.click();
		Thread.sleep(2000);
	    //MyQueueDetail.sendKeys(pro.getProperty("Suspicious_Queue"));
		MyQueueDetail.sendKeys("Testing");
		Thread.sleep(2000);
		MyQueueDetail.sendKeys(Keys.ENTER);
		FoundSuspicious.click();
		Thread.sleep(2000);
	}

		
} 
