package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class ReportPage extends FeedzaiTestBaseClass{

	
	@FindBy(xpath="//A[@href='#reports']")
	WebElement AMReports;
	
	@FindBy(xpath="//a[@class='button button-success button-xs action-download pleaseEnableTooltip']")
	WebElement AMReportsDownload;
	
	public ReportPage()  throws IOException {
		PageFactory.initElements(driver, this);;
		// TODO Auto-generated constructor stub
	}
	
	public void Report() throws Exception {
		AMReports.click();
		Thread.sleep(2000);
		AMReportsDownload.click();
		Thread.sleep(4000);
	}
	
	public AlertPage Merpage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		return new AlertPage(); 
}
}
