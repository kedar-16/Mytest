package com.mytest.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytest.base.BaseClass;
import com.mytest.pageobject.DashBoardPage;
import com.mytest.pageobject.HomePage;
import com.mytest.pageobject.LoginPage;
import com.mytest.pageobject.OPenTicketPage;

public class EndToEndTest extends BaseClass
{
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

@Test
public void endToEndTest() throws InterruptedException
	{
		hp=new HomePage() ;
		lp= new LoginPage() ;
		dp=new DashBoardPage() ;
	
		hp.clickOnUserLogin();
	
//		dp=lp.userLogin();
////		Reporter.log("User Enterd Username and password succesfully");
//////		dp.createTicket();
//////		Reporter.log("User Created Ticket Successfully");
////		Thread.sleep(6000);
////		dp.modifyTicket();
//////		dp.ChangeticketSetting();
//	op=new OPenTicketPage();
//	op.editTicket();
	}
}
