package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class Transactionpage extends FeedzaiTestBaseClass {
	
	//OR for SelectAlert
	@FindBy(xpath="//*[@id='navbar']/ul/li[3]/a")
	WebElement AMMERCHANTTab;
	
	@FindBy(xpath="//*[@id=\"navbar\"]/ul/li[1]/a")
	WebElement AlertTab;
	
	@FindBy(xpath="//input[@name='transactionCheck']")
	WebElement AlertSelect;
	
	@FindBy(xpath="//i[@class='glyphicon glyphicon-eye-open']")
	WebElement ViewSelectedAlert;
	
	//OR for MARK Transaction NOt FRAUD
	
	@FindBy(xpath="//button[@title='Mark as Not Fraud']")
	WebElement MarkNotFraud;
	
	@FindBy(xpath="//textarea[@placeholder='Enter observation.']")
	WebElement EnterYourObservation;
	
	@FindBy(xpath="//button[@class='button button-success action-not-fraud']")
	WebElement SelectNotFraud;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]")
	WebElement Check_Tran_Status;
	
	//OR for MARK Transaction FRAUD
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/button[2]")
	WebElement MarkFraud;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/textarea")
	WebElement MarkFraudObservation;
	
	@FindBy(xpath="//button[@class='button button-danger action-fraud']")
	WebElement SelectFraud;
	
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
	
	
	public Transactionpage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	public void ViewTransaction() throws InterruptedException {
		/*Alert_Setting.click();
		Alert_set_dec.click();
		Thread.sleep(1000);
		cust_Setting.click();
		cust_Text.click();
		Thread.sleep(1000);
		cust_TextEnter.sendKeys("1100000521");
		cust_TextEnter.sendKeys(Keys.ENTER); */
		ViewSelectedAlert.click();
		//AlertSelect.click();
		Thread.sleep(2000);
		
	}
	
	
	public void MARKTransactionNOTFRAUD() throws InterruptedException {
		MarkNotFraud.click();
		Thread.sleep(2000);
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation"));
		SelectNotFraud.click();
		Thread.sleep(4000);
		
	}
	
	public String VerifyTransType() {
		return Check_Tran_Status.getText();
	}
	
	/*public CustomerPage MARKTransactionFRAUD() throws InterruptedException, IOException{
		MarkFraud.click();
		Thread.sleep(2000);
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation1"));
		SelectFraud.click();
		Thread.sleep(4000);
		return new CustomerPage();   */
		
		public AlertPage MARKTransactionFRAUD() throws InterruptedException, IOException{
		MarkFraud.click();
		Thread.sleep(2000);
		EnterYourObservation.sendKeys(pro.getProperty("Fraud_Observation1"));
		SelectFraud.click();
		Thread.sleep(4000);
		return new AlertPage();
	
	}
}
