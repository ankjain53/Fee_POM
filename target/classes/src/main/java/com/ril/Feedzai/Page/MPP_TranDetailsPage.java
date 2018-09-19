package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.AlertPage;

public class MPP_TranDetailsPage extends FeedzaiTestBaseClass {
	
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
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-to pull-right']//div[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement tid;
	
	@FindBy(xpath="//html//div[3]/div[2]/div[1]/div[1]/div[2]")
	WebElement device_id;
	
	@FindBy(xpath="//html//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 fdz-css-flow-from pull-left']//div[2]/div[2]/div[1]/div[2]/div[2]")
	WebElement mpp_card;
	
	@FindBy(xpath="//html//div[3]/div[6]/div[2]")
	WebElement mpp_sid;
	
	public MPP_TranDetailsPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	
	public void MPP_Tran_Data() throws Exception
	{
		AMMERCHANTTab.click();
		AlertTab.click();
		Thread.sleep(2000);
		Alert_Setting.click();
		Alert_set_dec.click();
		Thread.sleep(2000);
		Channel_p2m.click();
		Thread.sleep(2000);
		channel_p2m_txt.sendKeys("MPP");
		channel_p2m_txt.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		response_code.click();
		response_code_enter.sendKeys("00");
		response_code_enter.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		p2m_view.click();
		
	}
	
	public String MPP_Customer_dt() throws Exception{
		return tid.getText();
		
	}
	
	public String MPP_Device_dt() throws Exception{
		return device_id.getText();
	
	}
	
	public String MPP_Card_dt() throws Exception{
		return mpp_card.getText();
		
	}
	
	public String MPP_transaction_dt() throws Exception{
		return mpp_sid.getText();
	}
	
	public AlertPage alert() throws Exception{
		return new AlertPage();
	}
}

