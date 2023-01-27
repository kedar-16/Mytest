package com.mytest.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytest.base.BaseClass;
import com.mytest.pageobject.DashBoardPage;
import com.mytest.pageobject.HomePage;
import com.mytest.pageobject.LoginPage;
import com.mytest.pageobject.OPenTicketPage;
import com.mytest.utility.Log;

public class DashBoardPageTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	DashBoardPage dp;
	OPenTicketPage op;
@BeforeMethod
	public void setup()
	
	{
		launchApp();
	}
@AfterMethod 
public void tearDown()
	{
		closeApp();
	}

@Test(groups = "sanity")
public void TC_002_CreateticketTest() throws InterruptedException
	{
		hp=new HomePage() ;
		lp= new LoginPage() ;
		dp=new DashBoardPage() ;
		Log.startTestCase("DashBoard Test Start");
		hp.clickOnUserLogin();
		Log.info("User Click On UserLogin Button");
		dp=lp.userLogin(prop.getProperty("username"),prop.getProperty("password"));
		Log.info("User Enter UserName and Password Successfully");
		dp.createTicket();
		Log.info("User Click On Create Ticket Successfully");
		Log.info("User Enter Ticket Name Successfully");
		Log.info("User Enter Ticket Description Successfully");
		Log.info("User Enter Change Font,Size of Description Succesfully");
		Log.info("User Select Assignee Of Ticket Successfully");
		Log.info("User Create Ticket Successfully");
		String actTicketName=dp.getTicketName();
		String expectedTicketName="test";
		Assert.assertEquals(actTicketName, expectedTicketName);
		Log.endTestCase("DashBoard Test End ");
	}

}
