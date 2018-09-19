package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class JBP_AdvanceSearchPage extends FeedzaiTestBaseClass{

	@FindBy(xpath="//a[@href='#search']")
	WebElement Search_tab;
	
	@FindBy(xpath="//input[@id='fdz-form-date-time']")
	WebElement Search_date;
	
	@FindBy(xpath="//button[@type='button'][contains(text(),'Done')]")
	WebElement Clear_txt;

	@FindBy(xpath="//div[@class='col-md-12']//button[@type='button']")
	WebElement Ad_Search;

	@FindBy(xpath="//input[@id='fdz-form-sender-pan']")
	WebElement JPB_Sender_pan;

	@FindBy(xpath="//input[@id='fdz-form-card-pan']")
	WebElement JPB_Benef_pan;
	
	@FindBy(xpath="//input[@id='fdz-form-sender-mmid']")
	WebElement JPB_Sender_MMID;
	
	@FindBy(xpath="//input[@id='fdz-form-beneficiary-mmid']")
	WebElement JPB_Benef_MMID;

	@FindBy(xpath="//button[@type='submit']")
	WebElement Ad_Search_in;
	
	@FindBy(xpath="//tbody[@style='opacity: 1;']")
	WebElement AD_tran_details;



public JBP_AdvanceSearchPage() throws Exception {
	PageFactory.initElements(driver, this);
}


public void AdvanceSearchSetup()throws Exception{
	Search_tab.click();
	Thread.sleep(2000);
}

public void Advance_Search() throws Exception
{
    Search_date.clear();
	Clear_txt.click();
	Thread.sleep(4000);
	Ad_Search.click();    
}

public String Sender_pan() throws Exception 
{

	JPB_Sender_pan.sendKeys(pro.getProperty("Sender_PAN_no"));
	Ad_Search_in.click();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,100)");
	logger.info("JPB Sender pan detail is displayed ");	
	 return AD_tran_details.getText();
}

public String Beneficiary_pan() throws Exception
{
	JPB_Benef_pan.sendKeys(pro.getProperty("Beneficiary_PAN_no"));
	Ad_Search_in.click();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,100)");
	return AD_tran_details.getText();

}


public String Sender_MMID() throws Exception
{
	JPB_Sender_MMID.sendKeys(pro.getProperty("Sender_MMID"));
	Ad_Search_in.click();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,100)");
	return AD_tran_details.getText();
}

public String Beneficiary_MMID() throws Exception
{
	JPB_Benef_MMID.sendKeys(pro.getProperty("Benef_MMID"));
	Ad_Search_in.click();
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,100)");
	return AD_tran_details.getText();
} 


public AlertPage Setting() throws IOException{
	return new AlertPage(); 
} 
}

