package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class IBW_TranDetailsPage  extends FeedzaiTestBaseClass{
	@FindBy(xpath=".//*[@id='navbar']/ul/li[3]/a")
	WebElement AMMERCHANTTab;	
			
	@FindBy(xpath="//*[@id=\"navbar\"]/ul/li[1]/a")
	WebElement AlertTab;
	
	@FindBy(xpath="//html//th[2]/button[1]")
	WebElement Alert_Setting;
	
	@FindBy(xpath="//i[@class='fa fa-sort-amount-desc']")
	WebElement Alert_set_dec;
	
	@FindBy(xpath="//html//th[9]/button[1]/i[1]")
	WebElement Channel_p2m;
	
	@FindBy(xpath="//div[@id='s2id_fdz-label-filterValue']//input[1]")
	WebElement channel_p2m_txt;
	
	@FindBy(xpath="//html//th[11]/button[1]/i[1]")
	WebElement response_code;
	
	@FindBy(xpath="//div[@id='s2id_fdz-label-filterValue']//input[1]")   
	WebElement response_code_enter;
	
	@FindBy(xpath="//tr[1]//td[@class='funcs fdz-css-overflow-visible']//a[1]")
	WebElement p2m_view;

	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[1]/div[2]/div[1]/div[2]/div[2]")
	WebElement bill_pay_cut_id;
	
	@FindBy(xpath="//html//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12']//div[1]/div[2]/div[3]/div[2]/div[2]")
	WebElement bil_pay_mob;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 col-sm-8 col-xs-12']/div[2]")
	WebElement bill_dt;
	
	@FindBy(xpath="//html//div[@class='col-md-12 col-lg-12 col-sm-12 col-xs-12 fdz-css-float-none']//div[3]/div[3]/div[2]")
	WebElement bill_pay_cust_appid;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[5]/div[2]")
	WebElement lmw_sid;
	
	
	public IBW_TranDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);;
		// TODO Auto-generated constructor stub
	}
	
	public void IBW_Tran_Data() throws Exception{
		AMMERCHANTTab.click();
		AlertTab.click();
		Thread.sleep(2000);
		Alert_Setting.click();
		Alert_set_dec.click();
		Thread.sleep(2000);
		Channel_p2m.click();
		Thread.sleep(1000);
		channel_p2m_txt.sendKeys("IBW");
		channel_p2m_txt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		response_code.click();
		response_code_enter.sendKeys("00");
		response_code_enter.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		p2m_view.click();
		
	}
	
	public String IBW_Customer_Details() {
		return bill_pay_cut_id.getText();
	}
	
	public String IBW_Customer_MNo() {
	return bil_pay_mob.getText();
	}
	public String IBW_Payment_Details() {
		return	bill_dt.getText();
	}
	
	public String IBW_transaction_Details() {
		return lmw_sid.getText();
		
	}
	
	public String IBW_cust_appid() {
		return bill_pay_cust_appid.getText();
		
	}
	
	public AlertPage alert() throws Exception {
		return new AlertPage();
	}
	
}
