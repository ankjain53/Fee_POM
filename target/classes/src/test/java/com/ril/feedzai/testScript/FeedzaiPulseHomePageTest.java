package com.ril.feedzai.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.FeedzaiPulseHomePage;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class FeedzaiPulseHomePageTest extends FeedzaiTestBaseClass {
	FeedzaiPulseHomePage pulsehome;
	
	
	public FeedzaiPulseHomePageTest() throws IOException {
		super();
		
	}

	
	@BeforeClass()
	public void FeedzaiPulse() throws InterruptedException, IOException {
		logger.info("Moved to Feedzai Pulse Page");
		pulsehome= new FeedzaiPulseHomePage();
		pulsehome.pulseLogin();
		logger.info("Clicked on SignIn");
		logger.info("User logged in successfully");
		
	}
	
	@Test (priority=85,groups= {"Home Page"},description="Pulse Application HealthCheck")
	public void Health() throws Exception{
		logger1 = extent.createTest("Pulse Application HealthCheck");
		String ActualToolTip1=pulsehome.Healthcheck();
		Assert.assertEquals("Application is On. Click to turn Off.", ActualToolTip1, "Application is Unhealthy-Restart the Application");
		logger.info("Feedzai Pulse application is up and running");

	}
	

	@Test(priority=86 ,description="Pulse Version check")
	public void Version() throws Exception{
		logger1 = extent.createTest("Pulse Version check");
		pulsehome.PulseVersion();
		logger.info("Pulse Version is Printed");
		TakeScreenshot.captuerScreenshot(driver,"Pulse Health Checkup");
		
	}
	
	@Test(priority=87 ,description="Pulse Distribution job execution status")
	public void Job() throws Exception{
		logger1 = extent.createTest("Pulse Distribution job execution status");
		String Status=pulsehome.DistributionJob();
		System.out.println("Job Status=" + Status);
		logger.info("Print Status");
		String run_status=pulsehome.Jobdate();
		System.out.println("Job Run Date and time =" + run_status);
		   logger.info("Printed Distribution job last run status");

	}
	
	@Test(priority=88 ,description="Enable Time Machine")
	public void TimeMachine() throws Exception{
		logger1 = extent.createTest("Enable Time Machine");
		pulsehome.EnableTimeMachine();
		logger.info("TimeMachine value is set to true");
		TakeScreenshot.captuerScreenshot(driver,"TimeMachine Enable");
	}
	
	@Test(priority=89 ,description="Feedzai Logout")
	public void Logout() throws InterruptedException{
	pulsehome.feedzai_Logout();
	logger.info("Logged out Sucessfully");
	}
	
	
	@AfterClass
	public AlertPageTest Alert() throws IOException {
		return new AlertPageTest();
		
	}
}