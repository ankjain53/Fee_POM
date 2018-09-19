package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AMSearchPage extends FeedzaiTestBaseClass{

	@FindBy(xpath="//a[@href='#search']")
	WebElement SearchTab;
	
	@FindBy(xpath="//button[@class='button button-default fdz-js-toggle-advanced-search']")
	WebElement Advanced_search;
	
	@FindBy(xpath="//input[@id='fdz-form-date-time']")
	WebElement Search_date;
	
	@FindBy(xpath="//button[@type='button'][contains(text(),'Done')]")
	WebElement Clear_txt;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-customer-id']")
	WebElement ClickonCustId;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-customer-id']//input[1]")
	WebElement inputCustID;
		
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-to pull-right']//div[1]/div[2]/div[1]/div[2]/div[2]")
	WebElement CustIDValue;
	
	@FindBy(xpath="//tr[1]//td[@class='funcs fdz-css-overflow-visible']//a[1]")
	WebElement FirstView;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-to pull-right']//div[1]/div[2]/div[3]/div[2]/div[2]")
	WebElement CustNoValue;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-merchant-id']")
	WebElement ClickonMerID;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-merchant-id']//input[1]")
	WebElement inputMerID;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-to pull-right']//div[1]/div[3]/div[2]")
	WebElement MerchIDValue;
	
	@FindBy(xpath="//div[@class='details-value'][contains(text(),'+919619658895')]")
	WebElement MerchNoValue;
	
	@FindBy(xpath="//*[@id='s2id_fdz-form-agent_id']")
	WebElement ClickonAgentID;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-agent_id']//input[1]")
	WebElement inputAgentID;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[@class='widget-wrapper']//div[1]/div[2]/div[2]")
	WebElement AgentIDValue;

	@FindBy(xpath="//div[@id='s2id_fdz-form-channel']")
	WebElement ClickonChannel;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-channel']//input[1]")
	WebElement inputChannel;
	
	@FindBy(xpath="//html//div[@class='col-md-12 col-lg-12 col-sm-12 col-xs-12 fdz-css-float-none']//div[@class='widget-stage details']/div[2]/div[1]/div[2]")
	WebElement ChannelIDValue;
		
	@FindBy(xpath="//div[@id='s2id_fdz-form-processing_code']")
	WebElement ClickProcessCode;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-processing_code']//input[1]")
	WebElement inputProcessCode;
	
	@FindBy(xpath="//html//div[1]/div[6]/div[2]")
	WebElement ProcessCodeValue;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-card-bin']")
	WebElement ClickCardBin;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-card-bin']//input[1]")
	WebElement inputCardBin;
	
	@FindBy(xpath="//div[@class='details-value'][contains(text(),'281232')]")
	WebElement CardBinValue;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-merchant-category-code']")
	WebElement ClickonMCC;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-merchant-category-code']//input[1]")
	WebElement inputMCC;

	@FindBy(xpath="//div[@id='s2id_fdz-form-response_code']")
	WebElement ClickonRespCode;
	
	@FindBy(xpath="//div[@id='s2id_fdz-form-response_code']//input[1]")
	WebElement inputRespCode;
	
	@FindBy(xpath="//html//div[@class='col-md-12 col-lg-12 col-sm-12 col-xs-12 fdz-css-float-none']//div[@class='widget-stage details']/div[2]/div[3]/div[2]")
	WebElement ResponseCodeValue;
	
	@FindBy(xpath="//input[@id='fdz-form-source-institution-id']")
	WebElement ClickonSrcInstID;
	
	@FindBy(xpath="//input[@name='source_institution_id']")
	WebElement inputSrcInstID;
	
	@FindBy(xpath="//div[@class='details-value'][contains(text(),'3132')]")
	WebElement SrcInstIDValue;
	
	@FindBy(xpath="//*[@id='fdz-form-hashed-pan']")
	WebElement ClickonHashCrdPan;
	
	@FindBy(xpath="//input[@name='hashed_card_pan']")
	WebElement inputHashCrdPan;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[2]/div[2]/div[1]/div[2]/div[2]")
	WebElement HashedValue;
	
	@FindBy(xpath="//*[@id='fdz-form-customer-device-id']")
	WebElement ClickonCustAppID;
	
	@FindBy(xpath="//input[@name='customer_device_id']")
	WebElement InputCustAppID;
	
	@FindBy(xpath="//html//div[@class='col-md-12 col-lg-12 col-sm-12 col-xs-12 fdz-css-float-none']//div[3]/div[3]/div[2]")
	WebElement CustAppIdValue;
	
	@FindBy(xpath="//*[@id='fdz-form-sender-pan']")
	WebElement ClickSenderPan;
	
	@FindBy(xpath="//input[@name='sender_pan']")
	WebElement inputSenderPan;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[2]/div[2]/div[1]/div[1]/div[2]")
	WebElement SenderPanValue;
	
	@FindBy(xpath="//button[@type='submit'][1]")
	WebElement searchButton;
	
	
	public AMSearchPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	public void clickSearchTab() throws Exception{
		SearchTab.click();
		Thread.sleep(2000);
		Search_date.clear();
		Clear_txt.click();
		Thread.sleep(3000);
		Advanced_search.click();
		Thread.sleep(3000);
		
	}
	
	public String SearchCustID() throws Exception{

		System.out.println("Clicked on Advance Search");
		ClickonCustId.click();
		//Thread.sleep(3000);
		inputCustID.sendKeys(pro.getProperty("CustID"));
	   Thread.sleep(3000);
		inputCustID.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "customer id selection ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		 Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		FirstView.click();
		js.executeScript("window.scrollBy(0,200)");
		return CustIDValue.getText();
		
	}
	
	public String SearchMerID() throws Exception{
		ClickonMerID.click();
		inputMerID.sendKeys(pro.getProperty("MerchantID"));
		Thread.sleep(4000);
		inputMerID.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Merchant ID selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		FirstView.click();
		js.executeScript("window.scrollBy(0,200)");
		return MerchIDValue.getText();
		
		
	}
	
	public String AdvanceSearchChannel() throws Exception{
		ClickonChannel.click();
		inputChannel.sendKeys("P2M");
		Thread.sleep(3000);
		inputChannel.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Channel selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		searchButton.click();
		FirstView.click();
		js.executeScript("window.scrollBy(0,200)");
		return ChannelIDValue.getText();
	} 
	
	public String AdvanceSearchAgentID() throws Exception{
	ClickonAgentID.click();
	inputAgentID.sendKeys(pro.getProperty("AGENTID"));
	Thread.sleep(10000);
	inputAgentID.sendKeys(Keys.ENTER);
	System.out.println("Verify");
	TakeScreenshot.captuerScreenshot(driver, "Agent Id selection");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
	System.out.println("Verify");
	Thread.sleep(3000);
	searchButton.click();
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	FirstView.click();
	System.out.println("Verify");
	System.out.println("Verify");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,200)");
	System.out.println("Verify");
	return AgentIDValue.getText();
		
	}
	
	public String AdvanceSearchCusNum() throws Exception{
		ClickonCustId.click();
		inputCustID.sendKeys(pro.getProperty("CustPhoneNumber"));
		Thread.sleep(3000);
		inputCustID.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Customer phone number selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		return CustNoValue.getText();
			
		
	}
	
	public String AdvanceSearchMerNum() throws Exception{
		ClickonMerID.click();
		inputMerID.sendKeys(pro.getProperty("MerchantPhoneNum"));
		Thread.sleep(3000);
		inputMerID.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Merchant phone number selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		return MerchNoValue.getText();
		
	}
	
	public String AdvanceSearchSrcInstID() throws Exception{
		inputSrcInstID.sendKeys(pro.getProperty("SourceInstID"));
		Thread.sleep(3000);
		inputSrcInstID.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Merchant phone number selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		FirstView.click();
	    //Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		return SrcInstIDValue.getText();
}
	public String AdvanceSearchResponseCode() throws Exception{
		ClickonRespCode.click();
		inputRespCode.sendKeys("00");
		Thread.sleep(3000);
		inputRespCode.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Response code selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		return ResponseCodeValue.getText();
		
	}
	
	public String AdvanceSearchProcessCode() throws Exception{
		ClickProcessCode.click();
		inputProcessCode.sendKeys("45");
		Thread.sleep(3000);
		inputProcessCode.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Process code selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		return ProcessCodeValue.getText();
		
	}
	
	public String AdvanceSearchHashedCardPan() throws Exception{
		ClickonHashCrdPan.click();
		inputHashCrdPan.sendKeys(pro.getProperty("Hashed_Card_pan"));
		Thread.sleep(3000);
		inputHashCrdPan.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Hashed card pan selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		FirstView.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		return HashedValue.getText();
		
	}
	
	public String AdvanceSearchCustAppID() throws Exception{
	ClickonCustAppID.click();
	InputCustAppID.sendKeys(pro.getProperty("CustomerAppID"));
	Thread.sleep(3000);
	InputCustAppID.sendKeys(Keys.ENTER);
	TakeScreenshot.captuerScreenshot(driver, "Customer AppID selection");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
	Thread.sleep(3000);
	searchButton.click();
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	FirstView.click();
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	return CustAppIdValue.getText();
	}
	
	public String AdvanceSearchSenderPan() throws Exception{
		ClickSenderPan.click();
		inputSenderPan.sendKeys(pro.getProperty("SenderPan"));
		Thread.sleep(3000);
		inputSenderPan.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "Sender card pan selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		return SenderPanValue.getText();
		
	}
	
	public String AdvanceSearchCardBin() throws Exception{
		ClickCardBin.click();
		inputCardBin.sendKeys(pro.getProperty("CardBin"));
		Thread.sleep(3000);
		inputCardBin.sendKeys(Keys.ENTER);
		TakeScreenshot.captuerScreenshot(driver, "CardBin selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		searchButton.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		FirstView.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		return CardBinValue.getText();
	}
	
	public AlertPage Merpage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		return new AlertPage(); 

}
}

	

