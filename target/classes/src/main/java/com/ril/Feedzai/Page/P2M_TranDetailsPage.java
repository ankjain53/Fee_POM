package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class P2M_TranDetailsPage extends FeedzaiTestBaseClass{
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
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement cust_dt_p2m;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[1]/div[2]/div[3]/div[2]/div[2]")
	WebElement mob_no;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[2]")
	WebElement cust_app_id;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[2]")
	WebElement merchant_app_id;


	public P2M_TranDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void P2M_Tran_Data() throws Exception{
	AMMERCHANTTab.click();
	AlertTab.click();
	Thread.sleep(2000);
	Alert_Setting.click();
	Alert_set_dec.click();
	Thread.sleep(2000);
	Channel_p2m.click();
	channel_p2m_txt.sendKeys("P2M");
	channel_p2m_txt.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	response_code.click();
	response_code_enter.sendKeys("00");
	response_code_enter.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	p2m_view.click();
	
}
	public String P2M_Customer_Data() throws Exception{
		return cust_dt_p2m.getText();
	}
	
	public String P2M_Customer_MNo() throws Exception{
		return mob_no.getText();
	}
	
	public String P2M_cust_app_id() throws Exception{
		return cust_app_id.getText();
	}
	
	public String P2M_merchant_app_id() throws Exception{
		return merchant_app_id.getText();
	}
	
	public AlertPage alet() throws Exception {
		return new AlertPage();
	}
}
