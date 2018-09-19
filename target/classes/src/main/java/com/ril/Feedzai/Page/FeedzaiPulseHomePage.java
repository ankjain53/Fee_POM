package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class FeedzaiPulseHomePage extends FeedzaiTestBaseClass{
	
	@FindBy(xpath="//a[@class='dropdown-toggle fdz-user-dropdown']")
	WebElement AMDrpdwn;
	
	@FindBy(xpath="//a[@class='fdz-js-logout']")
	WebElement AMLogout;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignIn;	
	
	@FindBy(xpath="//i[@class='icon-tab-application-32']")
	WebElement Application;	
	
	@FindBy(xpath="//div[@class='funcs']//button[@type='button']")
	WebElement Healthchk;
	
	@FindBy(xpath="//span[@class='text-ellipsis']")
	WebElement Healthchk1;
	
	@FindBy(xpath="//span[@class='fdz-css-footer-version']")
	WebElement Pulse_version;
	
	@FindBy(xpath="//i[@class='fa fa-chevron-down']")
	WebElement Modles;
	
	@FindBy(xpath="//i[@class='icon-tab-jobs-32']")
	WebElement Job;
	
	@FindBy(xpath="//html//div[@class='jobexecutionsListContainer']//li[1]/div[1]/div[1]")
	WebElement Job_RFG;
	
	@FindBy(xpath="//span[@class='text-success']")
	WebElement Job_RFG_Status;
	
	@FindBy(xpath="//div[@class='formattedTime fixLineHeight']")
	WebElement Job_RFG_Status_date_time;

	@FindBy(xpath="//i[@class='icon-tab-datainput-32']")
	WebElement Data_config;

	@FindBy(xpath="//*[@id=\"reliance\"]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/div[2]/span/span[3]/button[1]")
	WebElement Data_config_p2;
	
	@FindBy(xpath="//a[@class='edit-resource edit-dependencies'][@title='FIS Input Adapter']")
	WebElement Data_config_p2_FIS;
	
	@FindBy(xpath="//html//div[5]/div[1]/div[2]/div[1]")
	WebElement time_machine;
	
	@FindBy(xpath="//input[@type='text'][@name='conf_value']")
	WebElement input_tm;
	
	@FindBy(xpath="//i[@class='fa fa-check-circle-o fa-color-green']")
	WebElement time_machine_en;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-large save-button']")
	WebElement TM_save;
	
	@FindBy(xpath="//i[@class='fdz-css-header-arrow fa fa-angle-down']")
    WebElement Logout_UserName ;

	@FindBy(xpath="//*[@id=\"logout\"]")
    WebElement Logout ;


	public FeedzaiPulseHomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public void pulseLogin() throws InterruptedException {
		Thread.sleep(2000);
		AMDrpdwn.click();
		AMLogout.click();
		driver.get("https://10.130.236.50/pulseviews/management/#apps/reliance/dataconfiguration");
		Thread.sleep(2000);
		UserName.sendKeys(pro.getProperty("MyUserName"));
		Password.sendKeys(pro.getProperty("MyPassword"));
		SignIn.click();
		
	}
	
	public String Healthcheck() throws Exception{
		Application.click();
		Thread.sleep(1000);
		return Healthchk.getAttribute("data-original-title");
	}
	
	public String PulseVersion() throws Exception{
		Healthchk1.click();
		Thread.sleep(1000);
		return Pulse_version.getText();
	}
	
	
	public String DistributionJob() throws Exception{
		Modles.click();
		Job.click();
		Job_RFG.click();
		return Job_RFG_Status.getText();
	}
	
	
	public String Jobdate() throws Exception{
	return	Job_RFG_Status_date_time.getText();
	}
	
	
	public void EnableTimeMachine() throws Exception{
		Data_config.click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,100)");
		Data_config_p2.click();
		Data_config_p2_FIS.click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		time_machine.click();
		input_tm.sendKeys("true");
		time_machine_en.click();
		TM_save.click();
		
	}
	
	public void feedzai_Logout() throws InterruptedException{
		Logout_UserName.click();
		Thread.sleep(3000);
		Logout.click();
	}

	 public AlertPage alert() throws Exception{
		 return new AlertPage();
	 }

}
