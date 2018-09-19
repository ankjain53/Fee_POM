package com.ril.feedzai.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Page.BeneficiaryPan_ValidationPage;
import com.ril.Feedzai.Page.MPP_TranDetailsPage;

public class BeneficiaryPan_ValidationPageTest extends FeedzaiTestBaseClass{
	BeneficiaryPan_ValidationPage benfpan;

	public BeneficiaryPan_ValidationPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void benPanValidate() throws Exception {
		logger.info("Moved To Benificiary Pan validation Page");
		benfpan = new BeneficiaryPan_ValidationPage();
	}
	
	@Test(priority=80 , description="Validate Pan and beneficiary details in Alert Manager for P2M transaction")
	public void P2M_Tran() throws Exception{
		logger1 = extent.createTest("Validate Pan and beneficiary details in Alert Manager for P2M transaction");
		benfpan.P2M_Tran_Data();
		 String pan=benfpan.P2M_pan();
	        System.out.println("P2M Sender Pan value ="+ pan);
	        if(pan.equals("N/A"))
	        {
	            logger.info("P2M:: Sender pan Value is not present");
	            Assert.fail("P2M:Sender Pan value is not present");

	        }else {
	            logger.info("P2M:Sender Pan value is present");
	        }
	        
            String ben=benfpan.P2M_ben();
	        System.out.println("P2M Beneficiary pan Value ="+ ben);
	        if(ben.equals("N/A"))
	        {
	            logger.info("P2M:: Beneficiary pan Value is not present");
	            Assert.fail("Beneficiary Pan value is not present");

	        }else {
	            logger.info("P2M:Beneficiary Pan value is present");
	        }

	        String cust=benfpan.P2M_custvalue();
	        System.out.println("P2M Customer Value ="+ cust);
	        if(cust.equals("Unknown"))
	        {
	            logger.info("P2M::Customer Value is not present");
	            Assert.fail("Customer Pan value is not present");

	        }else {
	            logger.info("P2M::Customer Value is present");
	        }
	        
	        Thread.sleep(2000);

	    }
	

    @Test(priority=81 , description="Validate Pan and beneficiary details in Alert Manager for LMW transaction")
    public void LMW_Tran() throws Exception  {
        logger1 = extent.createTest("Validate Pan and beneficiary details in Alert Manager for LMW transaction");
        benfpan.LMW_Tran_Validation();
        
        String pan=benfpan.LMW_pan();
        System.out.println("LMW Sender Pan value ="+ pan);
        if(pan.equals("N/A"))
        {
            logger.info("LMW:: Sender pan Value is not present");
            Assert.fail("LMW:Sender Pan value is not present");

        }else {
            logger.info("LMW:Sender Pan value is present");
        }

       String ben=benfpan.LMW_ben();
        System.out.println("LMW Sender Pan value ="+ ben);
        if(ben.equals("N/A"))
        {
            logger.info("LMW:: Beneficiary pan Value is not present");
            Assert.fail("Beneficiary Pan value is not present");

        }else {
            logger.info("LMW:Beneficiary Pan value is present");
        }



        String cust=benfpan.LMW_custvalue();
        System.out.println("LMW Sender Pan value ="+ cust);
        if(cust.equals("Unknown"))
        {
            logger.info("LMW::Customer Value is not present");
            Assert.fail("Customer Pan value is not present");

        }else {
            logger.info("LMW::Customer Value is present");
        }
        Thread.sleep(2000);

    }


    @Test(priority=82 , description="Validate Pan and beneficiary details in Alert Manager for WPP transaction")
    public void WPP_Tran() throws Exception{
       logger1 = extent.createTest("Validate Pan and beneficiary details in Alert Manager for WPP transaction");
       benfpan.WPP_Tran_Validation();
   
       String pan=benfpan.WPP_pan();
       System.out.println("WPP Sender Pan value ="+ pan);
       if(pan.equals("N/A"))
       {
           logger.info("WPP:: Sender pan Value is not present");
           Assert.fail("WPP:Sender Pan value is not present");

       }else {
           logger.info("WPP:Sender Pan value is present");
       }

       String ben=benfpan.WPP_ben();
       System.out.println("WPP Sender Pan value ="+ ben);
       if(ben.equals("N/A"))
       {
           logger.info("WPP:: Beneficiary pan Value is not present");
           Assert.fail("Beneficiary Pan value is not present");

       }else {
           logger.info("WPP:Beneficiary Pan value is present");
       }


       String cust=benfpan.WPP_custvalue();
       System.out.println("WPP Sender Pan value ="+ cust);
       if(cust.equals("Unknown"))
       {
           logger.info("WPP::Customer Value is not present");
           Assert.fail("Customer Pan value is not present");

       }else {
           logger.info("WPP::Customer Value is present");
       }

       Thread.sleep(2000);
   }

    @Test(priority=83 , description="Validate Pan and beneficiary details in Alert Manager for MPP transaction")
    public void MPP_Tran() throws Exception{
    	logger1 = extent.createTest("Validate Pan and beneficiary details in Alert Manager for MPP transaction");
    	benfpan.MPP_trans_details();
    	
    	 String pan=benfpan.MPP_pan();
         System.out.println("MPP Sender Pan value ="+ pan);
         if(pan.equals("N/A"))
         {
             logger.info("MPP:: Sender pan Value is not present");
             Assert.fail("MPP:Sender Pan value is not present");

         }else {
             logger.info("MPP:Sender Pan value is present");
         }


         String ben=benfpan.MPP_ben();
         System.out.println("MPP MPP:Beneficiary Pan value ="+ ben);
         if(ben.equals("N/A"))
         {
             logger.info("**********MPP:: Beneficiary pan Value is not present***************");
             Assert.fail("Beneficiary Pan value is not present");

         }else {
             logger.info("MPP:Beneficiary Pan value is present");
         }
         Thread.sleep(2000);
     }
    
    @Test(priority=84 , description="Validate Pan and beneficiary details in Alert Manager for IBW transaction")
    public void IBW_trans_details() throws Exception{
    	logger1 = extent.createTest("Validate Pan and beneficiary details in Alert Manager for IBW transaction");
    	benfpan.IBW_trans_details();
    	
    	String pan=benfpan.IBW_pan();
        System.out.println("IBW Sender Pan value ="+ pan);
        if(pan.equals("N/A"))
        {
            logger.info("IBW:: Sender pan Value is not present");
            Assert.fail("IBW:Sender Pan value is not present");

        }else {
            logger.info("IBW:Sender Pan value is present");
        }


        String ben=benfpan.IBW_ben();
        System.out.println("IBW Beneficiary Pan value ="+ ben);
        if(ben.equals("N/A"))
        {
            logger.info("******IBW:: Beneficiary pan Value is not present*****");
            Assert.fail("Beneficiary Pan value is not present");

        }else {
            logger.info("IBW:Beneficiary Pan value is present");
        }


        Thread.sleep(3000);

        String cust=benfpan.IBW_custvalue();
        System.out.println("IBW Customer Pan value ="+ cust);
        if(cust.equals("Unknown"))
        {
            logger.info("IBW::Customer Value is not present");
            Assert.fail("Customer Pan value is not present");

        }else {
            logger.info("IBW::Customer Value is present");
        }

        Thread.sleep(2000);
    }
    
    @AfterClass
	public AlertPageTest Alertp() throws Exception {
		return new AlertPageTest();
	}
	
		
	}
  
  
	
