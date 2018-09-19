package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class LMW_TranDetailsPage  extends FeedzaiTestBaseClass{
	
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
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[1]/div[2]/div[2]")
	WebElement hashed_card_dt;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]")
	WebElement cust_mob_lmw;
	
	@FindBy(xpath="//DIV[@class='details-title'][text()='Source Institution ID']")
	WebElement lmw_sid;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]")
	WebElement instument_dt;

	
	
	public LMW_TranDetailsPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	public void P2M_Tran_Data() throws Exception{
		AMMERCHANTTab.click();
		AlertTab.click();
		Alert_Setting.click();
		Alert_set_dec.click();
		Channel_p2m.click();
		channel_p2m_txt.sendKeys("LMW");
		channel_p2m_txt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		response_code.click();
		response_code_enter.sendKeys("00");
		response_code_enter.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		p2m_view.click();
		
	}

	public String LMW_Instrument_details() throws Exception{
		return instument_dt.getText();
		
	}
	
	public String LMW_Hashed_details() throws Exception{
		return hashed_card_dt.getText();
		
	}
	
	public String LMW_Customer_dt() throws Exception{
		return cust_mob_lmw.getText();
	}
	
	public String LMW_transaction_details() throws Exception{
		return lmw_sid.getText();
	}
	
	public AlertPage alert() throws Exception{
		return new AlertPage();
	}
}
