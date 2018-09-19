package com.ril.Feedzai.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.Utility.WebElementListener;

public class FeedzaiTestBaseClass {

	public static WebDriver driver;
	public static Logger logger;
	public static Properties pro;
	public static WebDriverEventListener eventListener;
	public static EventFiringWebDriver e_driver; 
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger1;
	public static ITestResult result;
	static String nodeURL;


	
	public FeedzaiTestBaseClass() throws IOException {
		File Src = new File(".\\src\\main\\java\\com\\ril\\Feedzai\\Config\\Config.Properties");
		FileInputStream fis = new FileInputStream(Src);
		pro = new Properties();
		pro.load(fis);
		logger = Logger.getLogger("feedzai_AM_Login");
		PropertyConfigurator.configure(".\\src\\main\\java\\com\\ril\\Feedzai\\Config\\log4j.properties ");
		
	}	
		
	public static void Initializedriver() throws MalformedURLException {
	
		String browserName=pro.getProperty("browser");
	  if(browserName.equals("GC")) {
	   System.setProperty("webdriver.chrome.driver","D://Chrome Driver 2.38//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("Google Chrome Launched");
	  }
	  
	  else if(browserName.equals("FF")) {
		  System.setProperty("webdriver.gecko.driver","<path of firefox driver>");
			driver = new FirefoxDriver();
			logger.info("FireFox is launched Launched");
		  }
	  
	  else if(browserName.equals("Headless")){
		  System.setProperty("phantomjs.binary.path", "D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		  driver = new PhantomJSDriver();
	  }
		
	  else if(browserName.equals("Grid")) {
		  nodeURL = "http://192.168.30.13:4444/wd/hub";
	        DesiredCapabilities capability = DesiredCapabilities.chrome();
	        capability.setBrowserName("chrome");
	        capability.setPlatform(Platform.WINDOWS);
	        driver = new RemoteWebDriver(new URL(nodeURL), capability);
		  
	  }
	  
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get(pro.getProperty("baseURL"));
       driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
	   logger.info("Browser Opened");
	   
		// Initializing EventFiringWebDriver using Firefox WebDriver instance
		e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebElementListener();

		e_driver.register(eventListener);
		driver=e_driver;

	} 
	
	@BeforeSuite
	public void ReportSetUP(){
		
		logger.info("Inside Report Setup");
	   
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport9.html");
		// System.out.println(System.getProperty("user.dir") +"/test-output/STMExtentReport5.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Feedzai Test Automation");
		extent.setSystemInfo("Environment", "Pre-Prod");
		extent.setSystemInfo("Alert Manager Version", "(5.1.0.9.ff2422ae74)");
		extent.setSystemInfo("Pulse Version", "(15.1.25#0bd07f4)");
		extent.setSystemInfo("User Name", "Ankur Jain");


		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Feedzai Automation Testing Report");
		htmlReporter.config().setReportName("Feedzai Test Automation");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);

	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception{
	
		logger.info("Inside ResultSet");
		if(result.getStatus() == ITestResult.FAILURE)
		{
			//MarkupHelper is used to display the output in different colors
			logger1.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger1.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

			//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
			//We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 

			String screenshotPath = TakeScreenshot.captuerScreenshot(driver, result.getName());
			//To add it in the extent report 

			logger1.fail("Test Case Failed Snapshot is below " + logger1.addScreenCaptureFromPath(screenshotPath));


		}
		else if(result.getStatus() == ITestResult.SKIP){
			//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger1.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		} 
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger1.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
	}

	
	@AfterSuite
	public void endReport()
	{
		logger.info("Report End");
		extent.flush();
	}



}