package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class BeneficiaryPan_ValidationPage extends FeedzaiTestBaseClass{
	

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
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/span")
	WebElement alert_window_pan;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[6]/span")
	WebElement alert_window_ben;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/a")
	WebElement alert_window_cust;
	

	public BeneficiaryPan_ValidationPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	 public void P2M_Tran_Data() throws Exception{
		 AMMERCHANTTab.click();
		 AlertTab.click();
		 Alert_Setting.click();
		 Alert_set_dec.click();
		 Channel_p2m.click();
		 channel_p2m_txt.sendKeys("P2M");
		 channel_p2m_txt.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 response_code.click();
		 response_code_enter.sendKeys("00");
		 response_code_enter.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public String P2M_pan() throws Exception{
	 return alert_window_pan.getText();
	 }
	 
	 public String P2M_ben() throws Exception{
		 return alert_window_ben.getText();
}
	 public String P2M_custvalue() throws Exception{
		 return alert_window_cust.getText();
}
	 
	 
	 public void LMW_Tran_Validation() throws Exception{
		 AMMERCHANTTab.click();
		 AlertTab.click();
		 Alert_Setting.click();
		 Alert_set_dec.click();
		 Channel_p2m.click();
		 channel_p2m_txt.sendKeys("LMW");
		 channel_p2m_txt.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 response_code.click();
		 response_code_enter.sendKeys("00");
		 response_code_enter.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public String LMW_pan() throws Exception{
		 return alert_window_pan.getText();
	 }
	 
	 public String LMW_ben() throws Exception{
		 return alert_window_ben.getText();
}
	 public String LMW_custvalue() throws Exception{
		 return alert_window_cust.getText();
}
	 
	 public void WPP_Tran_Validation() throws Exception{
		 AMMERCHANTTab.click();
		 AlertTab.click();
		 Alert_Setting.click();
		 Alert_set_dec.click();
		 Channel_p2m.click();
		 channel_p2m_txt.sendKeys("WPP");
		 channel_p2m_txt.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 response_code.click();
		 response_code_enter.sendKeys("00");
		 response_code_enter.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public String WPP_pan() throws Exception{
		 return alert_window_pan.getText();
	 }
	 
	 public String WPP_ben() throws Exception{
		 return alert_window_ben.getText();
}
	 public String WPP_custvalue() throws Exception{
		 return alert_window_cust.getText();
}
	 
	 public void MPP_trans_details() throws Exception{
		 AMMERCHANTTab.click();
		 AlertTab.click();
		 Alert_Setting.click();
		 Alert_set_dec.click();
		 Channel_p2m.click();
		 channel_p2m_txt.sendKeys("MPP");
		 channel_p2m_txt.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 response_code.click();
		 response_code_enter.sendKeys("00");
		 response_code_enter.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public String MPP_pan() throws Exception{
		 return alert_window_pan.getText();
	 }
	 
	 public String MPP_ben() throws Exception{
		 return alert_window_ben.getText();
}

	 public void IBW_trans_details() throws Exception{
		 AMMERCHANTTab.click();
		 AlertTab.click();
		 Alert_Setting.click();
		 Alert_set_dec.click();
		 Channel_p2m.click();
		 channel_p2m_txt.sendKeys("IBW");
		 channel_p2m_txt.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 response_code.click();
		 response_code_enter.sendKeys("00");
		 response_code_enter.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public String IBW_pan() throws Exception{
		 return alert_window_pan.getText();
	 }
	 
	 public String IBW_ben() throws Exception{
		 return alert_window_ben.getText();
}
	 public String IBW_custvalue() throws Exception{
		 return alert_window_cust.getText();
} 
	 
	 
/*	 public AlertPage alert() throws Exception{
		 return new AlertPage();
	 } */
}
