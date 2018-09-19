package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;






public class SettingsPage extends FeedzaiTestBaseClass {
	
	@FindBy(xpath="//A[@href='#settings']")
	WebElement AMSettings;
	
	@FindBy(xpath="//a[@class='fdz-js-tab-queues pleaseEnableTooltip']")
	WebElement AMQueue;
	
	@FindBy(xpath="//input[@class='form-control fdz-js-search']")
	WebElement SelectYourQueue;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-eye-open']")
	WebElement ViewQueueDetails;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/thead/tr/th[2]/button")
	WebElement FilterbyDesc;
	
	@FindBy(xpath="//button[@title='Descending Sort']")
	WebElement DescQueueSelected;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement StoreQueueDate;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/span")
	WebElement StoreBeneficiaryID;
	
	
	

	public SettingsPage() throws IOException {
		PageFactory.initElements(driver, this);;
		// TODO Auto-generated constructor stub
	}

	 public void ClickOnSettings() throws Exception{
		 AMSettings.click();
		 Thread.sleep(2000);
		 AMQueue.click();
		 SelectYourQueue.click();
		 SelectYourQueue.sendKeys("JPB");
		 Thread.sleep(2000);
		 ViewQueueDetails.click();
		 Thread.sleep(2000);
		 FilterbyDesc.click();
		 Thread.sleep(2000);
		 DescQueueSelected.click();
		 Thread.sleep(1000);
		 DescQueueSelected.click();
		 Thread.sleep(2000);
	 }

	 public String QueueDate() throws Exception{
		 return StoreQueueDate.getText();

	 }
	 public String BenID() throws Exception{
		 Thread.sleep(2000);
		 return StoreBeneficiaryID.getText();
	 }


	/* public ReportPage Report() throws IOException{
		 return new ReportPage();

	 } */
	 
		public AlertPage Merpage() throws IOException, InterruptedException {
			Thread.sleep(2000);
			return new AlertPage(); 
	}
}
