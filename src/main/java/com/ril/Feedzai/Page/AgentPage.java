package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class AgentPage extends FeedzaiTestBaseClass {
	
	@FindBy(xpath=".//*[@id='navbar']/ul/li[4]/a")
	WebElement AGENTTab;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/input")
	WebElement AMEnterAgentID;
	
	@FindBy(xpath="html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div")
	WebElement AgentSelected;
	
	@FindBy(xpath="//div[@class='col-lg-8 col-md-8 col-sm-8 col-xs-8 agent-details']")
	WebElement AgentDetail;
	
	@FindBy(xpath="//div[@class='widget-stage details fdz-css-height-400']")
	WebElement AgentLocation;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[2]")
	WebElement TransactionStatistics;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[2]")
	WebElement ChannelStatics;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[3]/div/div/div[2]")
	WebElement TransactionHistory;
	

	public AgentPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void ClickAgentTab() throws Exception{
		AGENTTab.click();
		Thread.sleep(2000);
	}
	
	public void AgentSearch() throws Exception {
		AMEnterAgentID.sendKeys(pro.getProperty("AGENTID"));
		Thread.sleep(9000);
		AMEnterAgentID.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	
	public String AgentVerify() throws Exception{
		//Thread.sleep(2000);
		return AgentDetail.getText();
	
	}
	
	public void AgentCheckdetail() throws Exception{
		AgentLocation.click();
		ChannelStatics.click();
		TransactionHistory.click();
		Thread.sleep(2000);
		
	}
	
	/*public SettingsPage SetPage() throws IOException {
		return new SettingsPage();*/
	public AlertPage Merpage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		return new AlertPage(); 

	
}
}