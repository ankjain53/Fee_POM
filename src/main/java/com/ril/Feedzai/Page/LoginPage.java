package com.ril.Feedzai.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class LoginPage extends FeedzaiTestBaseClass{
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginInBtn;


	//Creating a constructor of LoginPage
     public LoginPage()throws IOException{
    	 //Initializing PageFactory Model 
    	 PageFactory.initElements(driver, this); 
	
}
     
     public String VerifyPageTitle() {
    	return driver.getTitle();
     }
     
     public AlertPage PerformsignUp(String Usname,String Pwd) throws IOException, InterruptedException {
    	 Username.sendKeys(Usname);
    	 password.sendKeys(Pwd);
    	 Thread.sleep(2000);
    	 LoginInBtn.click();
    	 Thread.sleep(3000);
    	 return new AlertPage(); //returns AlertPage Object
    	 
     }
}